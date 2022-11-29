package callexternalapi.service;

import callexternalapi.model.OrderRequest;
import callexternalapi.model.orderResponse.ClosedJob;
import callexternalapi.model.orderResponse.Data;
import callexternalapi.model.orderResponse.OrderResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.spring.web.json.Json;

import java.nio.file.ClosedDirectoryStreamException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class FilteredOrders {
Logger logger = LoggerFactory.getLogger(FilteredOrders.class);
    public OrderResponse getOrders(OrderRequest request) throws ParseException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<OrderRequest> entity = new HttpEntity<>(request,headers);
        String url = "https://esbtest.sn3.com.sa:443/cxf/getworkorderswfmroute/wfm/orders";
        OrderResponse response = restTemplate.exchange(url, HttpMethod.POST,entity,OrderResponse.class).getBody();

        String time = null;
        ClosedJob closedJob = new ClosedJob();
        List<ClosedJob> list = new ArrayList<>();
        ClosedJob filteredJobs = null;
        List<ClosedJob> closedJobs = response.getData().getClosedJobs();

        for (int i=0;i<closedJobs.size();i++){
            ClosedJob job =  closedJobs.get(i);
            time= job.getTime();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date dateTime = format.parse(time);
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateTime);
            int month = cal.get(Calendar.MONTH)+1;

            if (month == 4){
                 filteredJobs = closedJobs.get(i);
                 list.add(filteredJobs);
            }
        }
        Data data = new Data();
        data.setClosedJobs(list);
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setData(data);
        orderResponse.setDisplayMessage(response.getDisplayMessage());
        orderResponse.setStatusCode(response.getStatusCode());

        return  orderResponse;

    }

}

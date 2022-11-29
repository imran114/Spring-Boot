package callexternalapi.service;

import callexternalapi.model.OrderRequest;
import callexternalapi.model.orderResponse.OrderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
//@Service
public class OrderService {
    Logger logger = LoggerFactory.getLogger(OrderService.class);
    public OrderResponse orderApi(OrderRequest request) {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<OrderRequest> entity = new HttpEntity<OrderRequest>(request, headers);
            String url = "https://esbtest.sn3.com.sa:443/cxf/getworkorderswfmroute/wfm/orders";
            logger.info("ORDER REQUEST: "+request.toString());
            OrderResponse response = restTemplate.exchange(url
                    , HttpMethod.POST, entity, OrderResponse.class).getBody();
            return response;

        }

    }


package com.merge.api.service;


import com.merge.api.model.filtered.Filtered;
import com.merge.api.model.request.OrderRequest;
import com.merge.api.model.response.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    Logger logger = LoggerFactory.getLogger(OrderService.class);

    public OrderResponse orderApi(OrderRequest request) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<OrderRequest> entity = new HttpEntity<OrderRequest>(request, headers);
        String orderUrl = "https://esbtest.sn3.com.sa:443/cxf/calenderpagewfmroute/wfm/order";
        OrderResponse response = restTemplate.exchange(orderUrl
                , HttpMethod.POST, entity, OrderResponse.class).getBody();
        Job job = null;
        List<Job> list = new ArrayList<>();
        Filtered filtered = null;
        String checkIfConfirmed = null;
        List<Job> jobList = response.getData().getJobList();
        for (int i = 0; i < jobList.size(); i++) {
            checkIfConfirmed = jobList.get(i).getStatus();

            logger.info("confirmed:----> "+checkIfConfirmed);

        if (checkIfConfirmed.equals("confirmed")) {
             list.add(jobList.get(i));
            logger.info("LIST "+jobList.get(i));
            Data data = new Data();
            data.setJobList(list);
            response.setData(data);


        }}
        return response ;


    }
}
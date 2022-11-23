package com.merge.api.service;

import com.merge.api.model.request.workerRequest.GetWorkerMainRequest;
import com.merge.api.model.response.workerResponse.WorkerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
@Service
public class WorkerService {
    Logger logger = LoggerFactory.getLogger(WorkerService.class);

    public WorkerResponse workerApi(GetWorkerMainRequest getWorkerMainRequest) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        logger.info("Worker Service headers "+headers);
        HttpEntity<GetWorkerMainRequest> entity = new HttpEntity<GetWorkerMainRequest>(getWorkerMainRequest, headers);
        String url = "https://esbtest.sn3.com.sa:443/cxf/getworkerwfmroute/wfm/worker";
        // The pojo GetWorkerEsbResponse has two unused parameters i-e, reporting and exception but it is
        // still working and not giving any error
        logger.info("Worker Service Entity: "+entity);
        WorkerResponse  getWorkerEsbResponse = restTemplate.exchange(url
        , HttpMethod.POST, entity, WorkerResponse.class).getBody();
        logger.info("Worker Service template"+getWorkerEsbResponse);
        return getWorkerEsbResponse;

    }
}
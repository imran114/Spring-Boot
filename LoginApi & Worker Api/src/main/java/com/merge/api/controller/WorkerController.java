package com.merge.api.controller;

import com.merge.api.model.request.workerRequest.GetWorkerMainRequest;
import com.merge.api.model.response.workerResponse.WorkerResponse;
import com.merge.api.service.WorkerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@RestController
public class WorkerController {

    Logger logger = LoggerFactory.getLogger(WorkerController.class);
    WorkerService service = new WorkerService();
    @PostMapping("/worker")
    public WorkerResponse workerApi(@RequestBody GetWorkerMainRequest getWorkerMainRequest){
        return this.service.workerApi(getWorkerMainRequest);
    }
}

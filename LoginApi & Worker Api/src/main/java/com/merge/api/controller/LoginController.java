package com.merge.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.merge.api.model.LoginMergedResponse;
import com.merge.api.model.mergedloginresponse.MergedLoginResponse;
import com.merge.api.model.request.loginrequest.LoginMainRequest;
import com.merge.api.model.response.workerResponse.WorkerResponse;
import com.merge.api.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);
   @Autowired
    LoginService service;

    @PostMapping("/login")
    public MergedLoginResponse getApi(@RequestBody LoginMainRequest loginMainRequest) throws Exception {
        return this.service.loginApi(loginMainRequest);
    }
}

package com.merge.api.service;

import com.merge.api.model.mergedloginresponse.MergedLoginResponse;
import com.merge.api.model.mergedloginresponse.MergedLoginResponseData;
import com.merge.api.model.request.workerRequest.GetWorkerEsbRequest;
import com.merge.api.model.request.workerRequest.GetWorkerMainRequest;
import com.merge.api.model.LoginMergedResponse;
import com.merge.api.model.request.loginrequest.LoginMainRequest;
import com.merge.api.model.response.loginresponse.LoginResponseParent;
import com.merge.api.model.response.workerResponse.WorkerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
@Service
public class LoginService {
    Logger logger = LoggerFactory.getLogger(LoginService.class);
    @Autowired
    WorkerService workerService ;
    public MergedLoginResponse loginApi(LoginMainRequest loginMainRequest) {
        LoginMergedResponse loginMergedResponse = new LoginMergedResponse();
        MergedLoginResponseData mergedLoginResponseData = new MergedLoginResponseData();
        RestTemplate restTemplate = new RestTemplate();
        MergedLoginResponse mergedLoginResponse = new MergedLoginResponse();
        LoginResponseParent loginResponseParent = new LoginResponseParent();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<LoginMainRequest> entity = new HttpEntity<LoginMainRequest>(loginMainRequest, headers);
        String loginUrl = "https://esbtest.sn3.com.sa:443/cxf/loginwfmroute/wfm/login";
        LoginResponseParent loginResponse = restTemplate.exchange(loginUrl
                , HttpMethod.POST, entity, LoginResponseParent.class).getBody();

        if(loginResponse.getStatusCode().equals("200")) {
            logger.info("STATUS CODE: "+loginResponse.getStatusCode().toString());
            GetWorkerMainRequest getWorkerMainRequest = new GetWorkerMainRequest();
            GetWorkerEsbRequest getWorkerEsbRequest = new GetWorkerEsbRequest();
            getWorkerEsbRequest.setAccountType("cleaner");
            getWorkerEsbRequest.setUsername(loginResponse.getData().getName());
            getWorkerEsbRequest.setWorkerId(loginResponse.getData().getId());
            getWorkerEsbRequest.setLang(loginMainRequest.getLoginWfmEsbRequest().getLang());
            getWorkerEsbRequest.setChannel(loginMainRequest.getLoginWfmEsbRequest().getChannel());
            getWorkerEsbRequest.setAuthToken(loginResponse.getData().getAuthToken());

            getWorkerMainRequest.setGetWorkerEsbRequest(getWorkerEsbRequest);
            WorkerResponse response = workerService.workerApi(getWorkerMainRequest);

            loginMergedResponse.setAuthToken(loginResponse.getData().getAuthToken());
            loginMergedResponse.setId(response.getData().getId());
            loginMergedResponse.setName(response.getData().getName());
            loginMergedResponse.setCodigo(response.getData().getCodigo());
            mergedLoginResponse.setDisplayMessage("Your request has been processes successfully");
            mergedLoginResponse.setStatusCode(loginResponse.getStatusCode());
            mergedLoginResponseData.setCodigo(response.getData().getCodigo());
            mergedLoginResponseData.setId(response.getData().getId());
            mergedLoginResponseData.setId(loginResponse.getData().getId());
            mergedLoginResponseData.setName(loginResponse.getData().getName());
            mergedLoginResponse.setData(mergedLoginResponseData);

    }
        else {
            mergedLoginResponse.setDisplayMessage("Please provide valid username or password");
            mergedLoginResponse.setStatusCode(loginResponse.getStatusCode());

        }


        return mergedLoginResponse;
    }
}
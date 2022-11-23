package com.merge.api.model.request.workerRequest;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Component;

@Component
public class GetWorkerEsbRequest {
    private String username ;

    private int workerId;

    private String lang ;

    private String channel ;

    private JsonNode authToken;

    private String accountType ;

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setWorkerId(int workerId){
        this.workerId = workerId;
    }
    public int getWorkerId(){
        return this.workerId;
    }
    public void setLang(String lang){
        this.lang = lang;
    }
    public String getLang(){
        return this.lang;
    }
    public void setChannel(String channel){
        this.channel = channel;
    }
    public String getChannel(){
        return this.channel;
    }
    public void setAuthToken(JsonNode authToken){
        this.authToken = authToken;
    }
    public JsonNode getAuthToken(){
        return this.authToken;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public String getAccountType(){
        return this.accountType;
    }

    @Override
    public String toString() {
        return "GetWorkerEsbRequest{" +
                "username='" + username + '\'' +
                ", workerId='" + workerId + '\'' +
                ", lang='" + lang + '\'' +
                ", channel='" + channel + '\'' +
                ", authToken='" + authToken + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}

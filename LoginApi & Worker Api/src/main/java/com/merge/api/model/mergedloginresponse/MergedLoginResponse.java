package com.merge.api.model.mergedloginresponse;

public class MergedLoginResponse {
    String displayMessage;
    String statusCode;
    MergedLoginResponseData data;

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public MergedLoginResponseData getData() {
        return data;
    }

    public void setData(MergedLoginResponseData data) {
        this.data = data;
    }


}

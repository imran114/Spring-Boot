
package com.merge.api.model.response.workerResponse;

import com.fasterxml.jackson.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statusCode",
    "reporting",
    "exception",
    "displayMessage",
    "data"
})
@Component
@Generated("jsonschema2pojo")
public class WorkerResponse {

    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("reporting")
    private Object reporting;
    @JsonProperty("exception")
    private Object exception;
    @JsonProperty("displayMessage")
    private String displayMessage;
    @JsonProperty("data")
    private LoginData data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("reporting")
    public Object getReporting() {
        return reporting;
    }

    @JsonProperty("reporting")
    public void setReporting(Object reporting) {
        this.reporting = reporting;
    }

    @JsonProperty("exception")
    public Object getException() {
        return exception;
    }

    @JsonProperty("exception")
    public void setException(Object exception) {
        this.exception = exception;
    }

    @JsonProperty("displayMessage")
    public String getDisplayMessage() {
        return displayMessage;
    }

    @JsonProperty("displayMessage")
    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    @JsonProperty("data")
    public LoginData getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(LoginData data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

package com.merge.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statusCode",
    "reporting",
    "exception",
    "displayMessage",
    "authToken",
    "integrationToken",
    "id",
    "name",
    "resourceType",
    "workerStatus",
    "posPollingTime",
    "CODIGO",
    "ZONE"
})
@Generated("jsonschema2pojo")
public class LoginMergedResponse {

    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("reporting")
    private Object reporting;
    @JsonProperty("exception")
    private Object exception;
    @JsonProperty("displayMessage")
    private String displayMessage;
    @JsonProperty("authToken")
    private JsonNode authToken;
    @JsonProperty("integrationToken")
    private String integrationToken;
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("workerStatus")
    private String workerStatus;
    @JsonProperty("posPollingTime")
    private String posPollingTime;
    @JsonProperty("CODIGO")
    private String codigo;
    @JsonProperty("ZONE")
    private String zone;
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

    @JsonProperty("authToken")
    public JsonNode getAuthToken() {
        return authToken;
    }

    @JsonProperty("authToken")
    public void setAuthToken(JsonNode authToken) {
        this.authToken = authToken;
    }

    @JsonProperty("integrationToken")
    public String getIntegrationToken() {
        return integrationToken;
    }

    @JsonProperty("integrationToken")
    public void setIntegrationToken(String integrationToken) {
        this.integrationToken = integrationToken;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("workerStatus")
    public String getWorkerStatus() {
        return workerStatus;
    }

    @JsonProperty("workerStatus")
    public void setWorkerStatus(String workerStatus) {
        this.workerStatus = workerStatus;
    }

    @JsonProperty("posPollingTime")
    public String getPosPollingTime() {
        return posPollingTime;
    }

    @JsonProperty("posPollingTime")
    public void setPosPollingTime(String posPollingTime) {
        this.posPollingTime = posPollingTime;
    }

    @JsonProperty("CODIGO")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("CODIGO")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("ZONE")
    public String getZone() {
        return zone;
    }

    @JsonProperty("ZONE")
    public void setZone(String zone) {
        this.zone = zone;
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

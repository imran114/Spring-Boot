
package com.merge.api.model.filtered;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientDetails",
    "jobDetails",
    "jobBrief",
    "time",
    "status",
    "description"
})
@Generated("jsonschema2pojo")
public class Filtered {

    @JsonProperty("clientDetails")
    private ClientDetails clientDetails;
    @JsonProperty("jobDetails")
    private JobDetails jobDetails;
    @JsonProperty("jobBrief")
    private String jobBrief;
    private String message;
    private String statusCode;
    @JsonProperty("time")
    private String time;
    @JsonProperty("status")
    private String status;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clientDetails")
    public ClientDetails getClientDetails() {
        return clientDetails;
    }

    @JsonProperty("clientDetails")
    public void setClientDetails(ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    @JsonProperty("jobDetails")
    public JobDetails getJobDetails() {
        return jobDetails;
    }

    @JsonProperty("jobDetails")
    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    @JsonProperty("jobBrief")
    public String getJobBrief() {
        return jobBrief;
    }

    @JsonProperty("jobBrief")
    public void setJobBrief(String jobBrief) {
        this.jobBrief = jobBrief;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}


package com.merge.api.model.response;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

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
public class Job {

    @JsonProperty("clientDetails")
    private ClientDetails clientDetails;
    @JsonProperty("jobDetails")
    private JobDetails jobDetails;
    @JsonProperty("jobBrief")
    private String jobBrief;
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

    @Override
    public String toString() {
        return "Job{" +
                "clientDetails=" + clientDetails +
                ", jobDetails=" + jobDetails +
                ", jobBrief='" + jobBrief + '\'' +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

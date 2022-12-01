
package com.merge.api.model.response;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jobList"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("jobList")
    private List<Job> jobList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jobList")
    public List<Job> getJobList() {
        return jobList;
    }

    @JsonProperty("jobList")
    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
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
        return "Data{" +
                "jobList=" + jobList +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}


package com.merge.api.model.response;

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
    "jobId",
    "jodDescription",
    "direction",
    "agreedDate",
    "contactPhoneNumberCustomer"
})
@Generated("jsonschema2pojo")
public class JobDetails {

    @JsonProperty("jobId")
    private String jobId;
    @JsonProperty("jodDescription")
    private String jodDescription;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("agreedDate")
    private String agreedDate;
    @JsonProperty("contactPhoneNumberCustomer")
    private String contactPhoneNumberCustomer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    @JsonProperty("jobId")
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @JsonProperty("jodDescription")
    public String getJodDescription() {
        return jodDescription;
    }

    @JsonProperty("jodDescription")
    public void setJodDescription(String jodDescription) {
        this.jodDescription = jodDescription;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("agreedDate")
    public String getAgreedDate() {
        return agreedDate;
    }

    @JsonProperty("agreedDate")
    public void setAgreedDate(String agreedDate) {
        this.agreedDate = agreedDate;
    }

    @JsonProperty("contactPhoneNumberCustomer")
    public String getContactPhoneNumberCustomer() {
        return contactPhoneNumberCustomer;
    }

    @JsonProperty("contactPhoneNumberCustomer")
    public void setContactPhoneNumberCustomer(String contactPhoneNumberCustomer) {
        this.contactPhoneNumberCustomer = contactPhoneNumberCustomer;
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


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
    "jobId",
    "jodDescription",
    "direction",
    "agreedDate",
    "contactPhoneNumberCustomer",
    "duration",
    "instructions",
    "contactNameCustomer",
    "typeOfService",
    "zone",
    "paymentMethodCashOnDelivery",
    "orderIdMagento"
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
    @JsonProperty("duration")
    private Object duration;
    @JsonProperty("instructions")
    private Object instructions;
    @JsonProperty("contactNameCustomer")
    private Object contactNameCustomer;
    @JsonProperty("typeOfService")
    private Object typeOfService;
    @JsonProperty("zone")
    private Object zone;
    @JsonProperty("paymentMethodCashOnDelivery")
    private Object paymentMethodCashOnDelivery;
    @JsonProperty("orderIdMagento")
    private Object orderIdMagento;
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

    @JsonProperty("duration")
    public Object getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    @JsonProperty("instructions")
    public Object getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(Object instructions) {
        this.instructions = instructions;
    }

    @JsonProperty("contactNameCustomer")
    public Object getContactNameCustomer() {
        return contactNameCustomer;
    }

    @JsonProperty("contactNameCustomer")
    public void setContactNameCustomer(Object contactNameCustomer) {
        this.contactNameCustomer = contactNameCustomer;
    }

    @JsonProperty("typeOfService")
    public Object getTypeOfService() {
        return typeOfService;
    }

    @JsonProperty("typeOfService")
    public void setTypeOfService(Object typeOfService) {
        this.typeOfService = typeOfService;
    }

    @JsonProperty("zone")
    public Object getZone() {
        return zone;
    }

    @JsonProperty("zone")
    public void setZone(Object zone) {
        this.zone = zone;
    }

    @JsonProperty("paymentMethodCashOnDelivery")
    public Object getPaymentMethodCashOnDelivery() {
        return paymentMethodCashOnDelivery;
    }

    @JsonProperty("paymentMethodCashOnDelivery")
    public void setPaymentMethodCashOnDelivery(Object paymentMethodCashOnDelivery) {
        this.paymentMethodCashOnDelivery = paymentMethodCashOnDelivery;
    }

    @JsonProperty("orderIdMagento")
    public Object getOrderIdMagento() {
        return orderIdMagento;
    }

    @JsonProperty("orderIdMagento")
    public void setOrderIdMagento(Object orderIdMagento) {
        this.orderIdMagento = orderIdMagento;
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


package callexternalapi.model.orderResponse;

import java.util.Date;
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
    "orderIdMagento",
    "direction",
    "zone",
    "agreedDate",
    "duration",
    "contactNameCustomer",
    "contactPhoneNumberCustomer",
    "instructions",
    "paymentMethodCashOnDelivery",
    "typeOfService"
})
@Generated("jsonschema2pojo")
public class JobDetails {

    @JsonProperty("jobId")
    private String jobId;
    @JsonProperty("jodDescription")
    private String jodDescription;
    @JsonProperty("orderIdMagento")
    private Object orderIdMagento;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("zone")
    private Object zone;
    @JsonProperty("agreedDate")
    private String agreedDate;
    @JsonProperty("duration")
    private Object duration;
    @JsonProperty("contactNameCustomer")
    private Object contactNameCustomer;
    @JsonProperty("contactPhoneNumberCustomer")
    private String contactPhoneNumberCustomer;
    @JsonProperty("instructions")
    private Object instructions;
    @JsonProperty("paymentMethodCashOnDelivery")
    private Object paymentMethodCashOnDelivery;
    @JsonProperty("typeOfService")
    private Object typeOfService;
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

    @JsonProperty("orderIdMagento")
    public Object getOrderIdMagento() {
        return orderIdMagento;
    }

    @JsonProperty("orderIdMagento")
    public void setOrderIdMagento(Object orderIdMagento) {
        this.orderIdMagento = orderIdMagento;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("zone")
    public Object getZone() {
        return zone;
    }

    @JsonProperty("zone")
    public void setZone(Object zone) {
        this.zone = zone;
    }

    @JsonProperty("agreedDate")
    public String getAgreedDate() {
        return agreedDate;
    }

    @JsonProperty("agreedDate")
    public void setAgreedDate(String agreedDate) {
        this.agreedDate = agreedDate;
    }

    @JsonProperty("duration")
    public Object getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    @JsonProperty("contactNameCustomer")
    public Object getContactNameCustomer() {
        return contactNameCustomer;
    }

    @JsonProperty("contactNameCustomer")
    public void setContactNameCustomer(Object contactNameCustomer) {
        this.contactNameCustomer = contactNameCustomer;
    }

    @JsonProperty("contactPhoneNumberCustomer")
    public String getContactPhoneNumberCustomer() {
        return contactPhoneNumberCustomer;
    }

    @JsonProperty("contactPhoneNumberCustomer")
    public void setContactPhoneNumberCustomer(String contactPhoneNumberCustomer) {
        this.contactPhoneNumberCustomer = contactPhoneNumberCustomer;
    }

    @JsonProperty("instructions")
    public Object getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(Object instructions) {
        this.instructions = instructions;
    }

    @JsonProperty("paymentMethodCashOnDelivery")
    public Object getPaymentMethodCashOnDelivery() {
        return paymentMethodCashOnDelivery;
    }

    @JsonProperty("paymentMethodCashOnDelivery")
    public void setPaymentMethodCashOnDelivery(Object paymentMethodCashOnDelivery) {
        this.paymentMethodCashOnDelivery = paymentMethodCashOnDelivery;
    }

    @JsonProperty("typeOfService")
    public Object getTypeOfService() {
        return typeOfService;
    }

    @JsonProperty("typeOfService")
    public void setTypeOfService(Object typeOfService) {
        this.typeOfService = typeOfService;
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
        return "JobDetails{" +
                "jobId='" + jobId + '\'' +
                ", jodDescription='" + jodDescription + '\'' +
                ", orderIdMagento=" + orderIdMagento +
                ", direction='" + direction + '\'' +
                ", zone=" + zone +
                ", agreedDate='" + agreedDate + '\'' +
                ", duration=" + duration +
                ", contactNameCustomer=" + contactNameCustomer +
                ", contactPhoneNumberCustomer='" + contactPhoneNumberCustomer + '\'' +
                ", instructions=" + instructions +
                ", paymentMethodCashOnDelivery=" + paymentMethodCashOnDelivery +
                ", typeOfService=" + typeOfService +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

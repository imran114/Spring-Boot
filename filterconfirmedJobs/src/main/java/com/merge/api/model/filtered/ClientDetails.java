
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
    "clientId",
    "clientPhone",
    "clientLat",
    "clientLong",
    "clientName"
})
@Generated("jsonschema2pojo")
public class ClientDetails {

    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("clientPhone")
    private String clientPhone;
    @JsonProperty("clientLat")
    private String clientLat;
    @JsonProperty("clientLong")
    private String clientLong;
    @JsonProperty("clientName")
    private Object clientName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("clientPhone")
    public String getClientPhone() {
        return clientPhone;
    }

    @JsonProperty("clientPhone")
    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    @JsonProperty("clientLat")
    public String getClientLat() {
        return clientLat;
    }

    @JsonProperty("clientLat")
    public void setClientLat(String clientLat) {
        this.clientLat = clientLat;
    }

    @JsonProperty("clientLong")
    public String getClientLong() {
        return clientLong;
    }

    @JsonProperty("clientLong")
    public void setClientLong(String clientLong) {
        this.clientLong = clientLong;
    }

    @JsonProperty("clientName")
    public Object getClientName() {
        return clientName;
    }

    @JsonProperty("clientName")
    public void setClientName(Object clientName) {
        this.clientName = clientName;
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

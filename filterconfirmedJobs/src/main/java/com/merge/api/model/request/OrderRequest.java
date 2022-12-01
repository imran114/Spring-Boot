
package com.merge.api.model.request;

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
    "calenderPageWorkOrderWfmEsbRequest"
})
@Generated("jsonschema2pojo")
public class OrderRequest {

    @JsonProperty("calenderPageWorkOrderWfmEsbRequest")
    private CalenderPageWorkOrderWfmEsbRequest calenderPageWorkOrderWfmEsbRequest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("calenderPageWorkOrderWfmEsbRequest")
    public CalenderPageWorkOrderWfmEsbRequest getCalenderPageWorkOrderWfmEsbRequest() {
        return calenderPageWorkOrderWfmEsbRequest;
    }

    @JsonProperty("calenderPageWorkOrderWfmEsbRequest")
    public void setCalenderPageWorkOrderWfmEsbRequest(CalenderPageWorkOrderWfmEsbRequest calenderPageWorkOrderWfmEsbRequest) {
        this.calenderPageWorkOrderWfmEsbRequest = calenderPageWorkOrderWfmEsbRequest;
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

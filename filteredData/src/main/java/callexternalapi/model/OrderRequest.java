
package callexternalapi.model;

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
    "getWorkOrdersEsbRequest"
})
@Generated("jsonschema2pojo")
public class OrderRequest {

    @JsonProperty("getWorkOrdersEsbRequest")
    private GetWorkOrdersEsbRequest getWorkOrdersEsbRequest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("getWorkOrdersEsbRequest")
    public GetWorkOrdersEsbRequest getGetWorkOrdersEsbRequest() {
        return getWorkOrdersEsbRequest;
    }

    @JsonProperty("getWorkOrdersEsbRequest")
    public void setGetWorkOrdersEsbRequest(GetWorkOrdersEsbRequest getWorkOrdersEsbRequest) {
        this.getWorkOrdersEsbRequest = getWorkOrdersEsbRequest;
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

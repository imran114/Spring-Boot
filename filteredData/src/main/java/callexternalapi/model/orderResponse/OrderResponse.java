
package callexternalapi.model.orderResponse;

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
    "data",
    "statusCode",
    "displayMessage"
})
@Generated("jsonschema2pojo")
public class OrderResponse {

    @JsonProperty("data")
    private Data data;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("displayMessage")
    private String displayMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("displayMessage")
    public String getDisplayMessage() {
        return displayMessage;
    }

    @JsonProperty("displayMessage")
    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
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
        return "OrderResponse{" +
                "data=" + data +
                ", statusCode='" + statusCode + '\'' +
                ", displayMessage='" + displayMessage + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

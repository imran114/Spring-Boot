
package callexternalapi.model.orderResponse;

import java.util.HashMap;
import java.util.List;
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
    "today",
    "tomorrow"
})
@Generated("jsonschema2pojo")
public class Scheduled {

    @JsonProperty("today")
    private List<Object> today = null;
    @JsonProperty("tomorrow")
    private List<Object> tomorrow = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("today")
    public List<Object> getToday() {
        return today;
    }

    @JsonProperty("today")
    public void setToday(List<Object> today) {
        this.today = today;
    }

    @JsonProperty("tomorrow")
    public List<Object> getTomorrow() {
        return tomorrow;
    }

    @JsonProperty("tomorrow")
    public void setTomorrow(List<Object> tomorrow) {
        this.tomorrow = tomorrow;
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

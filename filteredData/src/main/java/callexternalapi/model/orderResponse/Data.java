
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
    "scheduled",
    "closedJobs"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("scheduled")
    private Scheduled scheduled;
    @JsonProperty("closedJobs")
    private List<ClosedJob> closedJobs = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scheduled")
    public Scheduled getScheduled() {
        return scheduled;
    }

    @JsonProperty("scheduled")
    public void setScheduled(Scheduled scheduled) {
        this.scheduled = scheduled;
    }

    @JsonProperty("closedJobs")
    public List<ClosedJob> getClosedJobs() {
        return closedJobs;
    }

    @JsonProperty("closedJobs")
    public void setClosedJobs(List<ClosedJob> closedJobs) {
        this.closedJobs = closedJobs;
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
                "scheduled=" + scheduled +
                ", closedJobs=" + closedJobs +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

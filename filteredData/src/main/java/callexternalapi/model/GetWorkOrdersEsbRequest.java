
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
    "username",
    "resourceId",
    "lang",
    "channel",
    "authToken",
    "reporting",
    "accountType",
    "ordersCategory"
})
@Generated("jsonschema2pojo")
public class GetWorkOrdersEsbRequest {

    @JsonProperty("username")
    private String username;
    @JsonProperty("resourceId")
    private String resourceId;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("authToken")
    private String authToken;
    @JsonProperty("reporting")
    private String reporting;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("ordersCategory")
    private String ordersCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("resourceId")
    public String getResourceId() {
        return resourceId;
    }

    @JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("authToken")
    public String getAuthToken() {
        return authToken;
    }

    @JsonProperty("authToken")
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    @JsonProperty("reporting")
    public String getReporting() {
        return reporting;
    }

    @JsonProperty("reporting")
    public void setReporting(String reporting) {
        this.reporting = reporting;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("ordersCategory")
    public String getOrdersCategory() {
        return ordersCategory;
    }

    @JsonProperty("ordersCategory")
    public void setOrdersCategory(String ordersCategory) {
        this.ordersCategory = ordersCategory;
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

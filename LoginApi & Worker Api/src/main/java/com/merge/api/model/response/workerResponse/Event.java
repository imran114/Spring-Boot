
package com.merge.api.model.response.workerResponse;

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
    "id",
    "workOrder",
    "resource",
    "material",
    "group",
    "time",
    "comment",
    "entityClassName",
    "source",
    "auditUser",
    "location",
    "clientId",
    "type",
    "eventData"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("workOrder")
    private Object workOrder;
    @JsonProperty("resource")
    private String resource;
    @JsonProperty("material")
    private Object material;
    @JsonProperty("group")
    private Object group;
    @JsonProperty("time")
    private String time;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("entityClassName")
    private String entityClassName;
    @JsonProperty("source")
    private String source;
    @JsonProperty("auditUser")
    private String auditUser;
    @JsonProperty("location")
    private Object location;
    @JsonProperty("clientId")
    private Object clientId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("eventData")
    private List<EventDatum> eventData = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("workOrder")
    public Object getWorkOrder() {
        return workOrder;
    }

    @JsonProperty("workOrder")
    public void setWorkOrder(Object workOrder) {
        this.workOrder = workOrder;
    }

    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    @JsonProperty("material")
    public Object getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(Object material) {
        this.material = material;
    }

    @JsonProperty("group")
    public Object getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(Object group) {
        this.group = group;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("entityClassName")
    public String getEntityClassName() {
        return entityClassName;
    }

    @JsonProperty("entityClassName")
    public void setEntityClassName(String entityClassName) {
        this.entityClassName = entityClassName;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("auditUser")
    public String getAuditUser() {
        return auditUser;
    }

    @JsonProperty("auditUser")
    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonProperty("clientId")
    public Object getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(Object clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("eventData")
    public List<EventDatum> getEventData() {
        return eventData;
    }

    @JsonProperty("eventData")
    public void setEventData(List<EventDatum> eventData) {
        this.eventData = eventData;
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

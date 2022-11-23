
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
    "CODIGO",
    "NAME",
    "ZONE",
    "ESTADO RECURSO",
    "PHONE_NUMBER",
    "RESOURCE_TYPE",
    "BIRTHDATE",
    "NATIONALITY",
    "WORK_SHIFT",
    "BUILDING",
    "AGE",
    "WORKLOAD",
    "LANGUAGE",
    "RELIGION",
    "PAYMENT_TERMS",
    "PASSWORD",
    "LONGITUDE_BUILDING",
    "DISPONIBILIDAD",
    "LATITUDE_BUILDING",
    "POST_PAID",
    "ELIMINADO",
    "BEGIN_DATE",
    "END_DATE",
    "BATTERY",
    "COVERAGE",
    "GPS",
    "USUARIO",
    "FECHA_TELEFONO",
    "id",
    "alias",
    "entityType",
    "status",
    "EVENTS",
    "LAST_LATITUDE",
    "GENDER",
    "LAST_LONGITUDE"
})
@Generated("jsonschema2pojo")
public class LoginData {

    @JsonProperty("CODIGO")
    private String codigo;
    @JsonProperty("NAME")
    private String name;
    @JsonProperty("ZONE")
    private String zone;
    @JsonProperty("ESTADO RECURSO")
    private String estadoRecurso;
    @JsonProperty("PHONE_NUMBER")
    private String phoneNumber;
    @JsonProperty("RESOURCE_TYPE")
    private String resourceType;
    @JsonProperty("BIRTHDATE")
    private String birthdate;
    @JsonProperty("NATIONALITY")
    private String nationality;
    @JsonProperty("WORK_SHIFT")
    private String workShift;
    @JsonProperty("BUILDING")
    private String building;
    @JsonProperty("AGE")
    private String age;
    @JsonProperty("WORKLOAD")
    private Integer workload;
    @JsonProperty("LANGUAGE")
    private String language;
    @JsonProperty("RELIGION")
    private String religion;
    @JsonProperty("PAYMENT_TERMS")
    private String paymentTerms;
    @JsonProperty("PASSWORD")
    private String password;
    @JsonProperty("LONGITUDE_BUILDING")
    private String longitudeBuilding;
    @JsonProperty("DISPONIBILIDAD")
    private Boolean disponibilidad;
    @JsonProperty("LATITUDE_BUILDING")
    private String latitudeBuilding;
    @JsonProperty("POST_PAID")
    private String postPaid;
    @JsonProperty("ELIMINADO")
    private Boolean eliminado;
    @JsonProperty("BEGIN_DATE")
    private String beginDate;
    @JsonProperty("END_DATE")
    private String endDate;
    @JsonProperty("BATTERY")
    private Integer battery;
    @JsonProperty("COVERAGE")
    private String coverage;
    @JsonProperty("GPS")
    private String gps;
    @JsonProperty("USUARIO")
    private String usuario;
    @JsonProperty("FECHA_TELEFONO")
    private String fechaTelefono;
    @JsonProperty("id")
    private int id;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("entityType")
    private String entityType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("EVENTS")
    private List<Event> events = null;
    @JsonProperty("LAST_LATITUDE")
    private Integer lastLatitude;
    @JsonProperty("GENDER")
    private String gender;
    @JsonProperty("LAST_LONGITUDE")
    private Integer lastLongitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CODIGO")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("CODIGO")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("NAME")
    public String getName() {
        return name;
    }

    @JsonProperty("NAME")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ZONE")
    public String getZone() {
        return zone;
    }

    @JsonProperty("ZONE")
    public void setZone(String zone) {
        this.zone = zone;
    }

    @JsonProperty("ESTADO RECURSO")
    public String getEstadoRecurso() {
        return estadoRecurso;
    }

    @JsonProperty("ESTADO RECURSO")
    public void setEstadoRecurso(String estadoRecurso) {
        this.estadoRecurso = estadoRecurso;
    }

    @JsonProperty("PHONE_NUMBER")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PHONE_NUMBER")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("RESOURCE_TYPE")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("RESOURCE_TYPE")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("BIRTHDATE")
    public String getBirthdate() {
        return birthdate;
    }

    @JsonProperty("BIRTHDATE")
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @JsonProperty("NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("NATIONALITY")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("WORK_SHIFT")
    public String getWorkShift() {
        return workShift;
    }

    @JsonProperty("WORK_SHIFT")
    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @JsonProperty("BUILDING")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("BUILDING")
    public void setBuilding(String building) {
        this.building = building;
    }

    @JsonProperty("AGE")
    public String getAge() {
        return age;
    }

    @JsonProperty("AGE")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("WORKLOAD")
    public Integer getWorkload() {
        return workload;
    }

    @JsonProperty("WORKLOAD")
    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @JsonProperty("LANGUAGE")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("LANGUAGE")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("RELIGION")
    public String getReligion() {
        return religion;
    }

    @JsonProperty("RELIGION")
    public void setReligion(String religion) {
        this.religion = religion;
    }

    @JsonProperty("PAYMENT_TERMS")
    public String getPaymentTerms() {
        return paymentTerms;
    }

    @JsonProperty("PAYMENT_TERMS")
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    @JsonProperty("PASSWORD")
    public String getPassword() {
        return password;
    }

    @JsonProperty("PASSWORD")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("LONGITUDE_BUILDING")
    public String getLongitudeBuilding() {
        return longitudeBuilding;
    }

    @JsonProperty("LONGITUDE_BUILDING")
    public void setLongitudeBuilding(String longitudeBuilding) {
        this.longitudeBuilding = longitudeBuilding;
    }

    @JsonProperty("DISPONIBILIDAD")
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    @JsonProperty("DISPONIBILIDAD")
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @JsonProperty("LATITUDE_BUILDING")
    public String getLatitudeBuilding() {
        return latitudeBuilding;
    }

    @JsonProperty("LATITUDE_BUILDING")
    public void setLatitudeBuilding(String latitudeBuilding) {
        this.latitudeBuilding = latitudeBuilding;
    }

    @JsonProperty("POST_PAID")
    public String getPostPaid() {
        return postPaid;
    }

    @JsonProperty("POST_PAID")
    public void setPostPaid(String postPaid) {
        this.postPaid = postPaid;
    }

    @JsonProperty("ELIMINADO")
    public Boolean getEliminado() {
        return eliminado;
    }

    @JsonProperty("ELIMINADO")
    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @JsonProperty("BEGIN_DATE")
    public String getBeginDate() {
        return beginDate;
    }

    @JsonProperty("BEGIN_DATE")
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    @JsonProperty("END_DATE")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("END_DATE")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("BATTERY")
    public Integer getBattery() {
        return battery;
    }

    @JsonProperty("BATTERY")
    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    @JsonProperty("COVERAGE")
    public String getCoverage() {
        return coverage;
    }

    @JsonProperty("COVERAGE")
    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    @JsonProperty("GPS")
    public String getGps() {
        return gps;
    }

    @JsonProperty("GPS")
    public void setGps(String gps) {
        this.gps = gps;
    }

    @JsonProperty("USUARIO")
    public String getUsuario() {
        return usuario;
    }

    @JsonProperty("USUARIO")
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @JsonProperty("FECHA_TELEFONO")
    public String getFechaTelefono() {
        return fechaTelefono;
    }

    @JsonProperty("FECHA_TELEFONO")
    public void setFechaTelefono(String fechaTelefono) {
        this.fechaTelefono = fechaTelefono;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("EVENTS")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("EVENTS")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @JsonProperty("LAST_LATITUDE")
    public Integer getLastLatitude() {
        return lastLatitude;
    }

    @JsonProperty("LAST_LATITUDE")
    public void setLastLatitude(Integer lastLatitude) {
        this.lastLatitude = lastLatitude;
    }

    @JsonProperty("GENDER")
    public String getGender() {
        return gender;
    }

    @JsonProperty("GENDER")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("LAST_LONGITUDE")
    public Integer getLastLongitude() {
        return lastLongitude;
    }

    @JsonProperty("LAST_LONGITUDE")
    public void setLastLongitude(Integer lastLongitude) {
        this.lastLongitude = lastLongitude;
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

package com.pagination.imran.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reporting_general")
@Getter
@Setter
public class ReportingGeneral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "transaction_name")
    public String transactionName;
    public String username;
    @Column(name = "contact_number")
    public String contactNumber;
    public String segment;
    @Column(name = "user_type")
    public String userType;
    @Column(name = "primary_key")
    public String primaryKey;
    public String channel;
    @Column(name = "response_code")
    public String ResponseCode;
    @Column(name = "request_time")
    public Date requestTime;
    @Column(name = "response_time")
    public Date responseTime;

}


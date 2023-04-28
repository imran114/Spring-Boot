package com.pagination.imran.repo;


import com.pagination.imran.entity.ReportingGeneral;
import com.pagination.imran.response.ActiveAccountReport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReportingGenRepo extends JpaRepository<ReportingGeneral, Integer> {

    @Query(value = "SELECT REPORTING_GENERAL.USERNAME AS userName, " +
            "ANY_VALUE (REPORTING_GENERAL.CONTACT_NUMBER ) AS contactNumber,ANY_VALUE (REPORTING_GENERAL.PRIMARY_KEY) AS primaryKey," +
            "MIN( REQUEST_TIME ) AS minRequestTime ,MAX( REQUEST_TIME ) AS maxRequestTime, " +
            "COUNT(IF ( RESPONSE_CODE = '1', 1, NULL )) AS success,COUNT(IF " +
            "( RESPONSE_CODE != '1', 1, NULL )) AS failed,COUNT(*) AS totalHits,CHANNEL as channel" +
            " FROM REPORTING_GENERAL WHERE " +
            " REPORTING_GENERAL.ID > 0 AND CHANNEL IN ?3 AND (REPORTING_GENERAL.REQUEST_TIME  BETWEEN ?1 AND ?2)" +
            " GROUP BY channel, username ",
            countQuery = "SELECT count(*) FROM REPORTING_GENERAL WHERE " +
                    " REPORTING_GENERAL.ID > 0 AND CHANNEL IN ?3 AND (REPORTING_GENERAL.REQUEST_TIME BETWEEN ?1 AND ?2)" +
                    " GROUP BY channel, username ", nativeQuery = true)
    public Page<ActiveAccountReport> getActiveAccountReportFilters(
            LocalDateTime startDate,
            LocalDateTime endDate,
            List<String> channel,
            Pageable pageable);

    @Query(value = "SELECT REPORTING_GENERAL.USERNAME AS userName,  " +
            " ANY_VALUE (REPORTING_GENERAL.CONTACT_NUMBER ) AS contactNumber,ANY_VALUE (REPORTING_GENERAL.PRIMARY_KEY) AS primaryKey, " +
            " MIN( REQUEST_TIME ) AS minRequestTime ,MAX( REQUEST_TIME ) AS maxRequestTime,  " +
            " COUNT(IF ( RESPONSE_CODE = '1', 1, NULL )) AS success,COUNT(IF  " +
            " ( RESPONSE_CODE != '1', 1, NULL )) AS failed,COUNT(*) AS totalHits,CHANNEL as channel " +
            " FROM reporting_general WHERE  " +
            " REPORTING_GENERAL.ID > 0  " +
            " GROUP BY channel, username",
            countQuery = "SELECT count(*) FROM REPORTING_GENERAL WHERE " +
                    " REPORTING_GENERAL.ID > 0 " +
                    " GROUP BY channel, username", nativeQuery = true)
    public Page<ActiveAccountReport> getActiveAccountReport(Pageable pageable);


    @Query(value = "SELECT REPORTING_GENERAL.USERNAME AS userName, " +
            "ANY_VALUE (REPORTING_GENERAL.CONTACT_NUMBER ) AS contactNumber,ANY_VALUE (REPORTING_GENERAL.PRIMARY_KEY) AS primaryKey," +
            "MIN( REQUEST_TIME ) AS minRequestTime ,MAX( REQUEST_TIME ) AS maxRequestTime, " +
            "COUNT(IF ( RESPONSE_CODE = '1', 1, NULL )) AS success,COUNT(IF " +
            "( RESPONSE_CODE != '1', 1, NULL )) AS failed,COUNT(*) AS totalHits,CHANNEL as channel" +
            " FROM REPORTING_GENERAL WHERE " +
            " REPORTING_GENERAL.ID > 0 AND (REPORTING_GENERAL.REQUEST_TIME  BETWEEN ?1 AND ?2)" +
            "GROUP BY channel, username ",
            countQuery = "SELECT count(*) FROM REPORTING_GENERAL WHERE " +
                    " REPORTING_GENERAL.ID > 0 AND (REPORTING_GENERAL.REQUEST_TIME  BETWEEN ?1 AND ?2)" +
                    "GROUP BY channel, username ", nativeQuery = true)
    public Page<ActiveAccountReport> getActiveAccountReportByDate(LocalDateTime startDate,
                                                                  LocalDateTime endDate,
                                                                  Pageable pageable);

    @Query(value = "SELECT REPORTING_GENERAL.USERNAME AS userName, " +
            "ANY_VALUE (REPORTING_GENERAL.CONTACT_NUMBER ) AS contactNumber,ANY_VALUE (REPORTING_GENERAL.PRIMARY_KEY) AS primaryKey," +
            "MIN( REQUEST_TIME ) AS minRequestTime ,MAX( REQUEST_TIME ) AS maxRequestTime, " +
            "COUNT(IF ( RESPONSE_CODE = '1', 1, NULL )) AS success,COUNT(IF " +
            "( RESPONSE_CODE != '1', 1, NULL )) AS failed,COUNT(*) AS totalHits,CHANNEL as CHANNEL" +
            " FROM REPORTING_GENERAL WHERE " +
            " REPORTING_GENERAL.ID > 0 AND REPORTING_GENERAL.CHANNEL IN ?1 " +
            " GROUP BY CHANNEL, USERNAME ",
            countQuery = "SELECT count(*) FROM REPORTING_GENERAL WHERE " +
                    " REPORTING_GENERAL.ID > 0 AND REPORTING_GENERAL.CHANNEL IN ?1 " +
                    " GROUP BY channel, username ", nativeQuery = true)
    public Page<ActiveAccountReport> getActiveAccountReportByChannel(List<String> channel,
                                                                      Pageable pageable);
    @Query(value = "SELECT REPORTING_GENERAL.USERNAME AS userName, " +
            "ANY_VALUE (REPORTING_GENERAL.CONTACT_NUMBER ) AS contactNumber,ANY_VALUE (REPORTING_GENERAL.PRIMARY_KEY) AS primaryKey," +
            "MIN( REQUEST_TIME ) AS minRequestTime ,MAX( REQUEST_TIME ) AS maxRequestTime, " +
            "COUNT(IF ( RESPONSE_CODE = '1', 1, NULL )) AS success,COUNT(IF " +
            "( RESPONSE_CODE != '1', 1, NULL )) AS failed,COUNT(*) AS totalHits,CHANNEL as channel" +
            " FROM REPORTING_GENERAL WHERE " +
            " REPORTING_GENERAL.ID > 0 AND REPORTING_GENERAL.userName LIKE %?1% OR "  +
            " REPORTING_GENERAL.CONTACT_NUMBER LIKE %?1% OR REPORTING_GENERAL.PRIMARY_KEY LIKE %?1% " +
            " GROUP BY channel, username ",
            countQuery = "SELECT count(*) FROM REPORTING_GENERAL WHERE " +
                    " REPORTING_GENERAL.ID > 0 AND REPORTING_GENERAL.userName LIKE %?1% OR " +
                    " REPORTING_GENERAL.CONTACT_NUMBER LIKE %?1% OR REPORTING_GENERAL.PRIMARY_KEY LIKE %?1%" +
                    " GROUP BY channel, username ", nativeQuery = true)
    public Page<ActiveAccountReport> getActiveAccountReportBySearch(String search,
                                                                   Pageable pageable);

    @Query(value = "SELECT REPORTING_GENERAL.USERNAME AS userName, " +
            "ANY_VALUE (REPORTING_GENERAL.CONTACT_NUMBER ) AS contactNumber,ANY_VALUE (REPORTING_GENERAL.PRIMARY_KEY) AS primaryKey," +
            "MIN( REQUEST_TIME ) AS minRequestTime ,MAX( REQUEST_TIME ) AS maxRequestTime, " +
            "COUNT(IF ( RESPONSE_CODE = '1', 1, NULL )) AS success,COUNT(IF " +
            "( RESPONSE_CODE != '1', 1, NULL )) AS failed,COUNT(*) AS totalHits,CHANNEL as channel" +
            " FROM REPORTING_GENERAL WHERE " +
            " REPORTING_GENERAL.ID > 0 AND (REPORTING_GENERAL.REQUEST_TIME  BETWEEN ?1 AND ?2) " +
            " AND REPORTING_GENERAL.userName LIKE %?3% OR " +
            " REPORTING_GENERAL.CONTACT_NUMBER LIKE %?3% OR REPORTING_GENERAL.PRIMARY_KEY LIKE %?3%"+
            " GROUP BY channel, username ",
            countQuery = "SELECT count(*) FROM REPORTING_GENERAL WHERE " +
                    " REPORTING_GENERAL.ID > 0 AND (REPORTING_GENERAL.REQUEST_TIME  BETWEEN ?1 AND ?2) " +
                    " AND REPORTING_GENERAL.userName LIKE %?3% OR " +
                    " REPORTING_GENERAL.CONTACT_NUMBER LIKE %?3% OR REPORTING_GENERAL.PRIMARY_KEY LIKE %?3%" +
                    " GROUP BY channel, username ", nativeQuery = true)
    public Page<ActiveAccountReport> getActiveAccountReportBySearchandDate(LocalDateTime startDate,
                                                                           LocalDateTime endDate,
                                                                           String search,
                                                                           Pageable pageable);

}

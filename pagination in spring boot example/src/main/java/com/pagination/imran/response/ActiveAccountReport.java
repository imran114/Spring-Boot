package com.pagination.imran.response;

import java.time.LocalDateTime;

public interface ActiveAccountReport {
    String getUserName();
    String getContactNumber();
    String getPrimaryKey();
    LocalDateTime getMinRequestTime();
    LocalDateTime getMaxRequestTime();
    String getSuccess();
    String getFailed();
    String getTotalHits();
    String getChannel();

}

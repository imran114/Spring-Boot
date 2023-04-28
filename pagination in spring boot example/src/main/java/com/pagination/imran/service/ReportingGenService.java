package com.pagination.imran.service;

import com.pagination.imran.repo.ReportingGenRepo;
import com.pagination.imran.request.ActiveAccountRequest;
import com.pagination.imran.response.ActiveAccountReport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j

@Service
public class ReportingGenService {
    @Autowired
    private ReportingGenRepo reportingGenRepo;

    public Page<ActiveAccountReport> paginatedActiveAccountReports(ActiveAccountRequest activeAccountRequest,
                                                                   Integer page, Integer size, String search) {
        Pageable pageable = PageRequest.of(page, size);
        if (search != null) {
            Page<ActiveAccountReport> activeAccountReports = reportingGenRepo.getActiveAccountReportBySearch(search, pageable);
            return activeAccountReports;
        }
        if (activeAccountRequest.getStartDate() != null &&
                activeAccountRequest.getEndDate() != null &&
                activeAccountRequest.getChannel().size() > 0) {

            Page<ActiveAccountReport> activeAccountReports = reportingGenRepo.getActiveAccountReportFilters(activeAccountRequest.getStartDate(),
                    activeAccountRequest.getEndDate(), activeAccountRequest.getChannel(), pageable);
            return activeAccountReports;
        }

        if (activeAccountRequest.getStartDate() == null &
                activeAccountRequest.getEndDate() == null &
                activeAccountRequest.getChannel().size() > 0)
        {
            Page<ActiveAccountReport> activeAccountReports   = reportingGenRepo.getActiveAccountReportByChannel(activeAccountRequest.getChannel(), pageable);
            return activeAccountReports;

        }
       if (activeAccountRequest.getStartDate() == null &
                activeAccountRequest.getEndDate() == null &
                activeAccountRequest.getChannel().isEmpty()) {
           Page<ActiveAccountReport> activeAccountReports = reportingGenRepo.getActiveAccountReport(pageable);
           return activeAccountReports;

        }
        if (activeAccountRequest.getChannel().size() == 0) {

            Page<ActiveAccountReport> activeAccountReports = reportingGenRepo.getActiveAccountReportByDate(activeAccountRequest.getStartDate(),
                    activeAccountRequest.getEndDate(), pageable);
            return activeAccountReports;

        }


            return null;
    }

   /* public Page<ActiveAccountReport> paginatedActiveAccountReport(ActiveAccountRequest activeAccountRequest,Integer page,
                                                                            Integer size, String search) {
        Page<ActiveAccountReport> activeAccountReports = null;
        Pageable pageable = PageRequest.of(page, size);

        if (activeAccountRequest.getStartDate() == null &
                activeAccountRequest.getEndDate() == null &
                activeAccountRequest.getChannel().isEmpty()) {
            activeAccountReports = reportingGenRepo.getActiveAccountReportBySearch(search, pageable);
        }
        return activeAccountReports;
    }*/
}
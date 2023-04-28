package com.pagination.imran.controller;


import com.pagination.imran.request.ActiveAccountRequest;
import com.pagination.imran.response.ActiveAccountReport;
import com.pagination.imran.service.ReportingGenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/repo")
public class ReportingGenController {
    @Autowired
    private ReportingGenService reportingGenService;

    @PostMapping("/get")
    public Page<ActiveAccountReport> findAll(
            @RequestBody(required = false) ActiveAccountRequest activeAccountRequest,
            @RequestParam(required = false,value = "page",defaultValue = "0") Integer page,
            @RequestParam(required = false,value = "size",defaultValue = "5") Integer size,
            @RequestParam(required = false,value = "search") String search) {
        return reportingGenService.paginatedActiveAccountReports(activeAccountRequest,page,size,search);

    }
    /*@GetMapping("/find")
    public Page<ActiveAccountReport> findBySearch(
            @RequestBody(required = false) ActiveAccountRequest activeAccountRequest,
            @RequestParam(required = false,value = "page",defaultValue = "0") Integer page,
            @RequestParam(required = false,value = "size",defaultValue = "5") Integer size,
            @RequestParam(required = false,value = "search") String search){
        return reportingGenService.paginatedActiveAccountReport(activeAccountRequest,page,size,search);
    }*/
}

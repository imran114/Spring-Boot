package com.merge.api.controller;

import com.merge.api.model.filtered.Filtered;
import com.merge.api.model.request.OrderRequest;
import com.merge.api.model.response.Job;
import com.merge.api.model.response.OrderResponse;
import com.merge.api.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Order;

@RestController
@RequestMapping("/")
public class OrderController {
    Logger logger = LoggerFactory.getLogger(OrderController.class);

   @Autowired
   OrderService service;

    @PostMapping("/order")
    public OrderResponse getApi(@RequestBody OrderRequest request) throws Exception {
        return this.service.orderApi(request);
    }
}

package callexternalapi.controller;

import callexternalapi.model.OrderRequest;
import callexternalapi.model.orderResponse.ClosedJob;
import callexternalapi.model.orderResponse.OrderResponse;
import callexternalapi.service.FilteredOrders;
import callexternalapi.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class OrderController {
    Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    FilteredOrders service;
    @PostMapping("/order")
    public OrderResponse workerApi(@RequestBody OrderRequest request) throws ParseException {
       return this.service.getOrders(request);
    }
}

package com.example.demo.postmapping;

import com.example.demo.config.DBUtilities;
import com.example.demo.controller.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@RestController
@RequestMapping
public class postapi {
    Logger logger = LoggerFactory.getLogger(postapi.class);
    PreparedStatement ps = null;
    @PostMapping("/employee")
    public void   insertData() throws SQLException, ClassNotFoundException {
         Employee employee = new Employee();
        String query = "insert into employee(emp_id,name,age,dep_id)"+"values(?,?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DBUtilities.getConnection();
        ps = con.prepareStatement(query);
        ps.setInt(1,employee.getEmp_id());
        ps.setString(2,employee.getName());
        ps.setInt(3,employee.getAge());
        ps.setInt(4,employee.getDep_id());
        int records_inserted = ps.executeUpdate();
        logger.info("An INFO Message");

    }
}

package com.evampSaanga.RehanTasks.service;

import com.evampSaanga.RehanTasks.model.EmployeeModel;
import com.evampSaanga.RehanTasks.queries.Queries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.evampSaanga.RehanTasks.DBUtilities.getConnection;

public class EmpGetService {

    List<EmployeeModel> li = new ArrayList<>();
    Queries q = new Queries();
    public List<EmployeeModel> getEmployee() {
        try {

            String query = q.getEmployee();
            Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            li.clear();
            while (rs.next()) {
                EmployeeModel obj = new EmployeeModel(rs.getInt("emp_id"),
                        rs.getString("name"), rs.getInt("age"),
                        rs.getInt("dep_id"));
                li.add(obj);
            }

            return li;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


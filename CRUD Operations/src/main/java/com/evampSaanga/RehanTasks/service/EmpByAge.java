package com.evampSaanga.RehanTasks.service;

import com.evampSaanga.RehanTasks.model.EmployeeModel;
import com.evampSaanga.RehanTasks.model.JoinModel;
import com.evampSaanga.RehanTasks.queries.Queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.evampSaanga.RehanTasks.DBUtilities.getConnection;

public class EmpByAge {

    Queries q = new Queries();
    List<JoinModel> list = new ArrayList<>();

    Statement st = null;


    public List<JoinModel> empByage() throws SQLException, ClassNotFoundException {
        EmployeeModel employeeModel = new EmployeeModel();
        String query = q.getEmployeeByAge();
        Connection con = getConnection();
        st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        list.clear();
        while (rs.next()){
            int emp_id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            int dep_id = rs.getInt(4);
            int id = rs.getInt(5);
            String dep_name = rs.getString(6);

            list.add(new JoinModel(emp_id,name,age,dep_id,id,dep_name));
        }
        return list;

    }
}

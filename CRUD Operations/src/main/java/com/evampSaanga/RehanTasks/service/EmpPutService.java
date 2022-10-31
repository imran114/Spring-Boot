package com.evampSaanga.RehanTasks.service;

import com.evampSaanga.RehanTasks.model.EmployeeModel;
import com.evampSaanga.RehanTasks.queries.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.evampSaanga.RehanTasks.DBUtilities.getConnection;

public class EmpPutService {

    EmployeeModel employeeModel = new EmployeeModel();
    Queries q = new Queries();
    PreparedStatement ps = null;
    public EmployeeModel updateEmployee(EmployeeModel employeeModel, int employeeId) throws SQLException, ClassNotFoundException {
        String query = q.putQuery();
        Connection con = getConnection();
        ps = con.prepareStatement(query);
        ps.setInt(1,employeeModel.getEmp_id());
        ps.setString(2,employeeModel.getName());
        ps.setInt(3,employeeModel.getAge());
        ps.setInt(4,employeeModel.getDep_id());
        ps.setInt(5,employeeId);

        int rs = ps.executeUpdate();

        if (rs > 0) {
            System.out.println("Updated");
        }
        return employeeModel;
    }



}
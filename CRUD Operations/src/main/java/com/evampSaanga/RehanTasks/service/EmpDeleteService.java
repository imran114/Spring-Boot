package com.evampSaanga.RehanTasks.service;

import com.evampSaanga.RehanTasks.model.EmployeeModel;
import com.evampSaanga.RehanTasks.queries.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.evampSaanga.RehanTasks.DBUtilities.getConnection;

public class EmpDeleteService {

    EmployeeModel employeeModel = new EmployeeModel();
    Queries q = new Queries();
    PreparedStatement ps = null;

    public EmployeeModel deleteEmployee(EmployeeModel employeeModel, int employeeId) throws SQLException, ClassNotFoundException {
        String query = q.deleteQuery();
        Connection con = getConnection();
        ps = con.prepareStatement(query);
        ps.setInt(1,employeeModel.getEmp_id());
        int rs = ps.executeUpdate();

        if (rs > 0) {
            System.out.println("Deleted");
        }
        return employeeModel;
    }

}

package com.evampSaanga.RehanTasks.service;

import com.evampSaanga.RehanTasks.model.EmployeeModel;
import com.evampSaanga.RehanTasks.queries.Queries;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.evampSaanga.RehanTasks.DBUtilities.getConnection;

public class empPostService {
    Queries q = new Queries();
    PreparedStatement ps = null;
    public ResponseEntity<EmployeeModel> addEmployee(EmployeeModel employeeModel) throws SQLException, ClassNotFoundException {

        Connection con = getConnection();
        String query = q.addEmployee();
        ps =  con.prepareStatement(query);
        ps.setInt(1,employeeModel.getEmp_id());
        ps.setString(2,employeeModel.getName());
        ps.setInt(3,employeeModel.getAge());
        ps.setInt(4,employeeModel.getDep_id());
        int records_inserted = ps.executeUpdate();
        return new ResponseEntity(HttpStatus.OK);
    }
}

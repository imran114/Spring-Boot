package com.evampSaanga.RehanTasks.controller;

import com.evampSaanga.RehanTasks.model.EmployeeModel;
import com.evampSaanga.RehanTasks.model.JoinModel;
import com.evampSaanga.RehanTasks.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.sql.SQLException;
import java.util.List;
@RestController
public class EmployeeController {

    EmpGetService employeeService = new EmpGetService();
    empPostService empPostService = new empPostService();
    EmpPutService empPutService = new EmpPutService();
    EmpDeleteService empDeleteService = new EmpDeleteService();
    JoinService joinService = new JoinService();
    EmpByAge empByAge = new EmpByAge();


    @GetMapping("/get/employee")
    public List<EmployeeModel> getEmployee() throws SQLException, ClassNotFoundException {
        return this.employeeService.getEmployee();
    }
    @PostMapping("/add/employee")
    public ResponseEntity<EmployeeModel> addEmployee(@RequestBody EmployeeModel employeeModel) throws SQLException, ClassNotFoundException {

        return this.empPostService.addEmployee(employeeModel);
    }
    @PutMapping("/update/employee/{empId}")
    public EmployeeModel updateEmployee(@RequestBody EmployeeModel employeeModel,@PathVariable int empId) throws SQLException, ClassNotFoundException {
    return this.empPutService.updateEmployee(employeeModel,empId);
    }
    @DeleteMapping("/delete/employee/{emp_id}")
    public EmployeeModel deleteEmployee(@RequestBody EmployeeModel employeeModel, @PathVariable int emp_id) throws SQLException, ClassNotFoundException {
        return this.empDeleteService.deleteEmployee(employeeModel,emp_id);
    }
    @GetMapping("/join")
    public List<JoinModel> jointables() throws SQLException, ClassNotFoundException {
        return  joinService.joinTables();
    }
    @GetMapping("/age")
    public List<JoinModel> getEmpByAge() throws SQLException, ClassNotFoundException {
        return this.empByAge.empByage();

    }


}

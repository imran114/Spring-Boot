package com.evampSaanga.RehanTasks.queries;

public class Queries {

    public String deleteQuery(){
        String query = "delete from employee where emp_id=?";
        return query;
    }
    public  String getEmployee(){
        String getEmployeeData = "Select * from employee";
        return getEmployeeData;
    }
    public String addEmployee(){
        String addEmployee = "insert into employee(emp_id,name,age,dep_id)"+" values(?,?,?,?)";
        return addEmployee;
    }
    public String putQuery(){
        String query = "update employee set emp_id=?,name = ?,age=?,dep_id=? where emp_id = ?";
        return query;
    }
    public String joinTables(){
        String query = "select emp_id,name,age,dep_id,id,dep_name\n" +
                "from employee  inner join department on employee.dep_id = department.id\n" +
                "where dep_id = 1";
        return query;
    }
    public String getEmployeeByAge(){
        String query = "select emp_id,name,age,dep_id,id,dep_name\n" +
                "from employee  inner join department on employee.dep_id = department.id\n" +
                "where age = 25";
        return query;
    }
}

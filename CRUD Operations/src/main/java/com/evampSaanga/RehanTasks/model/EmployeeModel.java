package com.evampSaanga.RehanTasks.model;

import org.springframework.stereotype.Component;


public class EmployeeModel {
    private int emp_id;
    private String name;
    private int age;
    private int dep_id;
    private int id;
    private String dep_name;
    public EmployeeModel(int emp_id, String name, int age, int dep_id) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;
        this.dep_id = dep_id;
    }


    public EmployeeModel(){

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }


}

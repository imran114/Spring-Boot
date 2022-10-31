package com.evampSaanga.RehanTasks.model;

public class JoinModel {

    private int emp_id;
    private String name;
    private int age;
    private int dep_id;
    private int id;
    private String dep_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public JoinModel(int emp_id, String name, int age, int dep_id) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;
        this.dep_id = dep_id;
    }

    public JoinModel(int emp_id, String name, int age, int dep_id, int id, String dep_name) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;
        this.dep_id = dep_id;
        this.id = id;
        this.dep_name = dep_name;
    }

    public JoinModel(){

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

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dep_id=" + dep_id +
                ", id=" + id +
                ", dep_name='" + dep_name + '\'' +
                '}';
    }

}

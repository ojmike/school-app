package com.schooldesign;

public class Person {
    private String name;
    private int age;
    private String level;
    private String maritalStatus;
    private double salary;
    private String studentStatus;

    public Person(String name, int age, String level, String maritalStatus, double salary) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.maritalStatus = maritalStatus;
        this.salary = salary;
    }

    public Person(String name, int age, String maritalStatus, String studentStatus) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.studentStatus = studentStatus;
    }

    public Person() {

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }
}

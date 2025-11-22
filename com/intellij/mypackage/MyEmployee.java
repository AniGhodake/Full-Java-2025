package com.intellij.mypackage;

public class MyEmployee {
    private  String name;
    private int age;
    private int salary;

    public MyEmployee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    String myEmployeeDetails(){
        return "Employee Name : "+name+", Age : "+age+", Salary : "+salary;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

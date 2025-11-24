package com.example.PackageChallenge;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Aniket Ghodake", 26, 25000);
        System.out.println(emp.getEmployeeDetails());
        System.out.println();
        emp.setName("Ani");
        emp.setAge(1001);
        emp.setSalary(200000);
        System.out.println(emp.getEmployeeDetails());
    }
}

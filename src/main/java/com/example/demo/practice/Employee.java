package com.example.demo.practice;

import java.util.Objects;

public class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name)
    {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name);
    }
}

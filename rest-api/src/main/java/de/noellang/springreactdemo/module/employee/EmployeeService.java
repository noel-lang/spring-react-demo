package de.noellang.springreactdemo.module.employee;

import de.noellang.springreactdemo.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
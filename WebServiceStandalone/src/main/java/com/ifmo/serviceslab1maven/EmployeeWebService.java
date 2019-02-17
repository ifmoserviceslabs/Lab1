package com.ifmo.serviceslab1maven;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "EmployeeService")
public class EmployeeWebService {
    @WebMethod(operationName = "getEmployees")
    public List<Employee> getEmployees() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Employee> employees = dao.getEmployees();
        return employees;
    }
    
    @WebMethod(operationName = "FilterEmployees")
    public List<Employee> filterEmployees(@WebParam(name = "name") String name, @WebParam(name = "surname") String surname, @WebParam(name = "age") int age, @WebParam(name = "city") String city, @WebParam(name = "department") int department) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Employee> employees = dao.filterEmployees(name, surname, age, city, department);
        return employees;
    }
}
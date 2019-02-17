package com.ifmo.servicesclientlab1;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class mainApplication {
    public static void printEmployee(Employee employee){
        System.out.println("name: " + employee.getName() + ", surname: " + employee.getSurname() + ", age: " + employee.getAge() + ", city: " + employee.getCity() + ", department: " + employee.getDepartment());
    }
    
    public static void listEmployees(EmployeeWebService port){
        System.out.println("Employees list:");
        List<Employee> employees = port.getEmployees();
        for(Employee employee : employees){
            printEmployee(employee);
        }
        System.out.println("Total employees: " + employees.size());
    }
    
    public static void filterEmployees(EmployeeWebService port, String name, String surname, int age, String city, int department){
        List<Employee> employees = port.filterEmployees(name, surname, age, city, department);
        for(Employee employee : employees){
            printEmployee(employee);
        }
        System.out.println("Total employees: " + employees.size());
    }
    
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/serviceslab1ee-war/EmployeeService?wsdl");
        EmployeeService employeeService = new EmployeeService(url);
        EmployeeWebService port = employeeService.getEmployeeWebServicePort();
        listEmployees(port);
        System.out.println("Filtering by name");
        filterEmployees(port, "Иван", "", 0, "", 0);
        System.out.println("Filtering by age");
        filterEmployees(port, "", "", 32, "", 0);
        System.out.println("Filtering by department");
        filterEmployees(port, "", "", 0, "", 2);
        System.out.println("Filtering by age and department");
        filterEmployees(port, "", "", 32, "", 2);
    }
}
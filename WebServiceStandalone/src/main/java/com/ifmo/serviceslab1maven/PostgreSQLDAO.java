package com.ifmo.serviceslab1maven;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgreSQLDAO {
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                int department = rs.getInt("department");
                String city = rs.getString("city");
                Employee employee = new Employee(name, surname, age, city, department);
                employees.add(employee);
            }
        } catch (SQLException ex) {
        Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }
    
    private List<Employee> convertSetToList(ResultSet rs) throws SQLException{
        List<Employee> employees = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            int age = rs.getInt("age");
            int department = rs.getInt("department");
            String city = rs.getString("city");
            Employee employee = new Employee(name, surname, age, city, department);
            employees.add(employee);
        }
        return employees;
    }
    
    public List<Employee> filterEmployees(String name, String surname, int age, String city, int department) {
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            String query = "select * from employee";
            List<String> filterOptions = new ArrayList<>();
            if(name != null && !name.trim().isEmpty()){
                filterOptions.add("name = '" + name + "'");
            }
            if(surname != null && !surname.trim().isEmpty()){
                filterOptions.add("surname = '" + surname + "'");
            }
            if(age > 0){
                filterOptions.add("age = " + age);
            }
            if(city != null && !city.trim().isEmpty()){
                filterOptions.add("city = '" + city + "'");
            }
            if(department > 0){
                filterOptions.add("department = " + department);
            }
            for(int i=0; i<filterOptions.size(); ++i)
                if(i == 0)
                    query += " where " + filterOptions.get(i);
                else
                    query += " and " + filterOptions.get(i);
            ResultSet rs = stmt.executeQuery(query);
            employees = convertSetToList(rs);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }
}
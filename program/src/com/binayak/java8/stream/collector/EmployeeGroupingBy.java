package com.binayak.java8.stream.collector;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeGroupingBy {

    public static void main(String[] args) {
        List<Employee> employeees = getEmployees();
        Map<String, List<Employee>> employeeMap = employeees.stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Employee::getCity));
        employeeMap.forEach((key, val) -> System.out.println(
                "The city : " + key + "  And the Employee : " + val
        ));
        String name = employeeMap.get("Bangalore").stream()
                .collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)), Optional::get)).getName();
        System.out.println("The bangalore Employee's name having highest alary is : " + name);
    }

    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setCity("Bangalore");
        e1.setId(1);
        e1.setName("Binayak");
        e1.setSalary(100000);
        Employee e2 = new Employee();
        e2.setCity("Pune");
        e2.setId(2);
        e2.setName("Ramesh");
        Employee e3 = new Employee();
        e3.setCity("Bangalore");
        e3.setId(3);
        e3.setName("santosh");
        e3.setSalary(90000000);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        return employees;
    }
}


class Employee {
    int id;
    String name;
    String city;
    long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

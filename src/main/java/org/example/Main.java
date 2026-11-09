package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static List<Employee> findDuplicates(List<Employee> list){
        List<Employee> repeated = new LinkedList<>();
        Set<Integer> uniqueId = new HashSet<>();
        Set<Integer> repeatedId = new HashSet<>();

        for(Employee employee:list){
        if(employee == null) continue;
        int id = employee.getId();
        if(!uniqueId.add(id)){
            if(repeatedId.add(id))
                repeated.add(employee);
        }
        }
        return repeated;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list){
        Map<Integer,Employee> uniques = new HashMap<>();
        for(Employee employee: list){
            if(employee == null) continue;
            int id = employee.getId();
                uniques.put(id,employee);
        }
        return uniques;
    }
    public static List<Employee> removeDuplicates(List<Employee> list){
        List<Employee> uniqueList = new LinkedList<>();
        Set<Integer> uniqueId = new HashSet<>();
        Set<Integer> repeatedId = new HashSet<>();
        for(Employee employee:list){
            if(employee == null) continue;
            int id=employee.getId();
            if(!uniqueId.add(id)){
                repeatedId.add(id);
            }
        }
        for(Employee employee:list){
            if(employee == null) continue;
            int id = employee.getId();
            if(!repeatedId.contains(id)){
                uniqueList.add(employee);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1,"Furkan","Gül"));
        employeeList.add(new Employee(1,"Furkan","Gül"));
        employeeList.add(new Employee(2,"Ahmet","Keskin"));
        employeeList.add(new Employee(3,"Ali","Biçer"));
        System.out.println(employeeList);
    }

}
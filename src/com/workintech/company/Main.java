package com.workintech.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "Cengiz", "Yildirim"));
        employees.add(new Employee(2, "Beren", "Ates"));
        employees.add(new Employee(3, "Kerem", "Yilmaz"));
        employees.add(new Employee(3, "Murat", "Kurnaz"));
        employees.add(new Employee(4, "Ceren", "Uremis"));
        employees.add(new Employee(5, "Mertcan", "Aykac"));
        employees.add(new Employee(5, "Ugur", "Erdem"));
        employees.add(new Employee(6, "Emine", "Baskurt"));

        List<Employee> removedList = new ArrayList<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(null == employee){
                System.out.println("Bos data bulundu.");
                continue;
            }
            if (employeeMap.containsKey(employee.getId())){
                removedList.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        System.out.println("Tum liste: ");
        System.out.println(employees);
        System.out.println("Tekiller: ");
        System.out.println(employeeMap);
        System.out.println("Silinenler: ");
        System.out.println(removedList);
    }
}
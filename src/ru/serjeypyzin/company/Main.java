package ru.serjeypyzin.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ivan Ivanov", "back", "88008888888",
                40000, 35, LocalDate.of(1986, 3, 23)));
        employees.add(new Employee("Petr Ivanov", "dev-ops", "88009999999",
                45000, 24, LocalDate.of(2000, 1, 2)));
        employees.add(new Employee("Anna Petrova", "designer", "88007777777",
                55000, 45, LocalDate.of(1979, 9, 19)));
        employees.add(new Employee("Marina Semenova", "front", "88006666666",
                35000, 47, LocalDate.of(1977, 2, 28)));
        employees.add(new Employee("Sergey Semenov", "QA", "88005555555",
                55000, 47, LocalDate.of(1977, 8, 23)));
        employees.add(new ProductManager("Anna Semenova", "Product Manager", "88001111111",
                100000, 23, LocalDate.of(2001, 1,1)));

        System.out.println(employees);
        ProductManager.increaseSalaryWithoutDirector(employees, 10000);
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println(employees);
    }

    public static double averageSalary (List<Employee> employees){
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }

    public static int averageAge (List<Employee>employees){
        return (int) employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0);
    }
}
package ru.serjeypyzin.company;

import java.time.LocalDate;
import java.util.List;


/*
* Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
* модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
* В основной программе создайте руководителя и поместите его в общий массив сотрудников.
* Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
* */
public class ProductManager extends Employee{
    public ProductManager(String fullName, String post, String phone, double salary, int age, LocalDate birthDate) {
        super(fullName, post, phone, salary, age, birthDate);
    }

    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public String getPost() {
        return super.getPost();
    }

    @Override
    public void setPost(String post) {
        super.setPost(post);
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public int compareTo(Employee o) {
        return super.compareTo(o);
    }

    public static void increaseSalaryWithoutDirector(List<Employee> employees, int amount) {
        employees.stream()
                .filter(i -> !(i instanceof ProductManager))
                .forEach(i -> i.setSalary(i.getSalary() + amount));
    }

    public static void increaseSalary(List<Employee> employees) {
        employees.stream()
                .filter(i -> i.getAge() > 45)
                .forEach(i -> i.setSalary(i.getSalary() + 5000));
    }

    public static void increaseSalary(List<Employee> employees, double amount, int age) {
        employees.stream()
                .filter(i -> i.getAge() > age)
                .forEach(i -> i.setSalary(i.getSalary() + amount));
    }
}

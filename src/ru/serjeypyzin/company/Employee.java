package ru.serjeypyzin.company;

import java.time.LocalDate;


/*
* Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
*  представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
* */
public class Employee implements Comparable<Employee>{
    private String fullName;
    private String post;
    private String phone;
    private double salary;
    private int age;
    private final LocalDate birthDate;


    public Employee(String fullName, String post, String phone, double salary, int age, LocalDate birthDate) {
        this.fullName = fullName;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return info();
    }

    public String info(){
        return String.format("Сотрудник: Имя - %s, Должность - %s, Зарплата - %.2f, Возраст - %d, Дата рождения - %s, Телефон - %s\n",
                this.fullName, this.post, this.salary, this.age, this.birthDate, this.phone);
    }


    private int compareDate (LocalDate firstDate, LocalDate secondDate){
        return firstDate.compareTo(secondDate);
    }
    @Override
    public int compareTo(Employee employee) {
        return compareDate(this.getBirthDate(), employee.getBirthDate());
    }




}

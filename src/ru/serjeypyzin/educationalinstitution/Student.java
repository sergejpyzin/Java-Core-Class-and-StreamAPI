package ru.serjeypyzin.educationalinstitution;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = new ArrayList<>(grades);
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }


    public List<Double> getGrades() {
        return grades;
    }


    public String getSpecialty() {
        return specialty;
    }


    public double getAverageGrade(List<Double> grades) {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return String.format("Студент: Имя %s, Специализация %s, Средний балл %.2f\n",
                this.getName(), this.specialty, this.getAverageGrade(this.grades));
    }
}


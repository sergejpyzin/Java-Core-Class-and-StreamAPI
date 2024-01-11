package ru.serjeypyzin.educationalinstitution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


/*
* Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
Найдите первых 5 студентов специальности "Информатика" со средним баллом выше 4.5, отсортированных по убыванию среднего балла.
В решении не использовать циклы! Только StreamAPI
* */
public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Ivan", List.of(4.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Информатика");
        Student student2 = new Student("Anna", List.of(4.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Информатика");
        Student student3 = new Student("Sergey", List.of(4.0, 4.0, 5.0, 5.0, 5.0, 5.0), "Информатика");
        Student student4 = new Student("Semen", List.of(4.0, 5.0, 4.0, 5.0, 5.0, 5.0), "Информатика");
        Student student5 = new Student("Natalia", List.of(4.0, 4.0, 4.0, 5.0, 5.0, 5.0), "Physics science");
        Student student6 = new Student("Sofiya", List.of(4.0, 4.0, 4.0, 5.0, 5.0, 5.0), "Chemical science");
        Student student7 = new Student("Artem", List.of(4.0, 4.0, 4.0, 5.0, 5.0, 5.0), "Physics science");
        Student student8 = new Student("Elena", List.of(4.0, 4.0, 4.0, 5.0, 5.0, 5.0), "Chemical science");
        Student student9 = new Student("Vitaliy", List.of(4.0, 4.0, 3.0, 5.0, 5.0, 5.0), "Информатика");
        Student student10 = new Student("Vitalina", List.of(4.0, 4.0, 5.0, 5.0, 5.0, 5.0), "Информатика");
        Student student11 = new Student("Vanessa", List.of(5.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Информатика");


        Student student12 = new Student("Petr", List.of(5.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Physics science");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);

        System.out.println(getStudentListInAverageGrades(students, "Информатика", 4.5));



    }

    public static List<Student> getStudentListInAverageGrades(List<Student> students, String specialization, double averageGrade) {
        return students.stream()
                .filter(student -> student.getSpecialty().equals(specialization))
                .filter(student -> student.getAverageGrade(student.getGrades()) > averageGrade)
                .sorted((s1, s2) -> Double.compare(
                        s2.getAverageGrade(s2.getGrades()),
                        s1.getAverageGrade(s1.getGrades())))
                .limit(5)
                .collect(Collectors.toList());
    }


    /**
     * Метод псевдослучайной генерации списка вещественных чисел типа Double в диапазоне от 4 до 5 (только целая часть)
     * @param size - размер списка
     * @return - List<Double>
     */
    public static List<Double> generateRandomDoubles(int size) {
        return new Random().doubles(size, 4, 5 )
                .mapToObj(value -> (double) Math.round(value))
                .collect(Collectors.toList());
    }
}

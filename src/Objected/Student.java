package Objected;

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int[] marks;

    public Student(String name, String surname, int[] marks) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    public void showStudentData() {
        System.out.println(name + " " + surname + " " + Arrays.toString(marks) + " średnia: " + calculateAverage());
    }

    public double calculateAverage() {
        double sum = 0;
        for (int value : marks) {
            sum += value;
        }
        return sum / marks.length;
    }
}
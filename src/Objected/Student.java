package Objected;

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int[] marks;
   //private double average;

    public Student(String studentName, String surname, int[] marks) {
        name = studentName;
        this.surname = surname;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int[] getMarks() {
        return marks;
    }

//    public double getAverage() {
//        return average;
//    }

    public double calculateAverage() {
        double sum = 0;
        for (int value : marks) {
            sum += value;
        }
        return sum / marks.length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

//    public void setAverage(double average) {
//        this.average = average;
//    }

    public void showStudentData() {
        System.out.println(name + " " + surname + " " + Arrays.toString(marks) + calculateAverage());
    }

}
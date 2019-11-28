package Objected;

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int[] marks;

    public Student(String dupa, String surname, int[] marks) {
        name = dupa;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void showStudentData() {
        System.out.println(name + " " + surname + " " + Arrays.toString(marks));
    }

}
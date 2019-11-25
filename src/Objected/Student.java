package Objected;

public class Student {
    private String name;
    private String surname;
    private double mark1;
    //private double mark2;
    //private double mark3;
    //private double mark4;
    //private double mark5;

    public Student(String name, String surname, double mark) {
        this.name = name;
        this.surname = surname;
        this.mark1 = mark;
        // this.mark2 = mark;
        // this.mark3 = mark;
        // this.mark4 = mark;
        // this.mark5 = mark;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public double getMark1(){
        return mark1;
    }

    public void setName() {
        this.name = name;
    }

    public void setSurname() {
        this.surname = surname;
    }
}

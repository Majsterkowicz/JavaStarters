package Objected;

public class StudentRegister {
    public static void main(String[] args) {
        Student student1 = new Student("Karol", "Kasztaniak" );
    }
    show

    private static void showStudentData(Student student) {
        System.out.println(student.getName() + " " + student.getSurname());
    }
}

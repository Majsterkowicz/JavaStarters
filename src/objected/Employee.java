package objected;

class Employee {
    private String name;
    private String surname;
    private double salary;
    private int id;
    private static int nextId = 1;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        setId();
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID: %s. pracownik: %s %s, zarabia %s", id, name, surname, salary);
    }

    public String showClass(){
        return "Jesteś w klasie Employee";
    }
}
package objected;

public class Director extends Supervisor {

    private String carID;

    public Director(String employeeType, String name, String surname, double salary, double bonus, String carID) {
        super(employeeType, name, surname, salary, bonus);
        this.carID = carID;
    }

    @Override
    public String toString() {
        return super.toString() + ", samochód: " + carID;
    }
}

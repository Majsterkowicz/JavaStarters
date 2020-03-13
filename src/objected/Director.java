package objected;

public class Director extends Supervisor {

    private String carID;

    public Director (int employeeTypeId, String name, String surname, double salary, double bonus, String carID){
        super (employeeTypeId, name, surname, salary, bonus);
        this.carID = carID;
    }

    @Override
    public String toString() {
        return super.toString() + " samochód: " + carID;
    }
}

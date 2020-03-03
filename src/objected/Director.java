package objected;

public class Director extends Supervisor {

    private String carID;

    public Director (String name, String surname, double salary, double bonus, String carID){
        super (name, surname, salary, bonus);
        this.carID = carID;
    }

}

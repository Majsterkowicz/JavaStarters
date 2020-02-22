package objected;

import java.util.ArrayList;

public class Foreman extends Employee {

    private ArrayList<String> tools;

    public Foreman(String name, String surname, double salary, ArrayList<String> tools) {
        super(name, surname, salary);
        this.tools = tools;
    }

    @Override
    public String showClass() {
        return "Jesteś w klasie Foreman";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String showTools(){
        return String.format("Foreman %s posiada: %s", getName(), tools.toString());
    }
}

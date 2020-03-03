package objected;

import java.util.ArrayList;
import java.util.List;

public class Foreman extends Employee {

    private List<String> tools;

    public Foreman(String name, String surname, double salary, List<String> tools) {
        super(name, surname, salary);
        this.tools = tools;
    }

    public static Foreman createForeman() {
        System.out.println("Podaj imię");
        String name = scanner.next();
        System.out.println("Podaj nazwisko");
        String surname = scanner.next();
        System.out.println("Podaj pensję");
        double salary = scanner.nextDouble();
        List<String> tools = createTools();
        Foreman foreman = new Foreman(name, surname, salary, tools);
        return foreman;
    }

    public static List<String> createTools() {
        List<String> tools = new ArrayList<>();
        String choice;
        do {
            System.out.println("Podaj narzędzie");
            String tool = scanner.next();
            tools.add(tool);
            System.out.println("Dodać kolejne narzędzie?");
            choice = scanner.next();
        }
        while (choice == "t");
        return tools;
    }

    @Override
    public String showClass() {
        return "Jesteś w klasie Foreman";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String showTools() {
        return String.format("Foreman %s posiada: %s", getName(), tools.toString());
    }
}

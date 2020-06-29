package interfaces;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<Car> providedCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi("A6", "gasoline",
                1996, 185));
        cars.add(new Citroen("Xara", "gasoline",
                1390, 125));
        cars.add(new Renault("Megane", "diesel",
                1489, 95));
        cars.add(new Dacia("Logan", "gasoline",
                1392, 75));
        cars.add(new Fiat("Panda", "gasoline",
                1225, 60));
        return cars;
    }
}

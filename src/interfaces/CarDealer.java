package interfaces;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    public static List<Car> newCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi("A4", "gasoline", 1950, 150));
        cars.add(new Citroen("Berlingo", "diesel", 1985, 105));
        cars.add(new Dacia("Logan", "gasoline", 1198, 60));
        cars.add(new Fiat("Tipo", "gasoline", 1390, 85));
        cars.add(new Renault("Megane", "gasoline", 1575, 125));
        return cars;
    }

    public static List<CarInterface> betterCars(){
        List<CarInterface> goodCars = new ArrayList<>();
        for (Car car : newCars()){
            if (car instanceof CarInterface){
                //goodCars.add(car);
                goodCars.add((CarInterface) car);
                ((CarInterface) car).englishCarInfo();
                ((CarInterface) car).nativeCarInfo();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        betterCars();
    }
}

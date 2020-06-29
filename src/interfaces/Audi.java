package interfaces;

public class Audi extends Car implements CarInterface {

    public Audi(String carModel, String carEngineType,
                int engineCapacity, int enginePower) {
        super(carModel, carEngineType, engineCapacity, enginePower);
    }

    @Override
    public void englishCarInfo() {
        System.out.println(String.format("This is Audi %s, powered by %s ccm and %s horsepower %s engine.",
                getCarModel(), getEngineCapacity(), getEnginePower(), getCarEngineType()));
    }

    @Override
    public void englishInfo() {
        System.out.println("This is Audi");
    }

    @Override
    public void nativeCarInfo() {
        System.out.println(String.format("Audi %s, Motorspezifikationen: Motortyp: %s, Kapazität: %s, Leistung: %s.",
                getCarModel(), getCarEngineType(), getEngineCapacity(), getEnginePower()));
    }
}

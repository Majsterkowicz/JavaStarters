package interfaces;

public class Renault extends Car implements CarInterface {

    public Renault(String carModel, String carEngineType,
                int engineCapacity, int enginePower) {
        super(carModel, carEngineType, engineCapacity, enginePower);
    }

    @Override
    public void englishCarInfo() {
        System.out.println(String.format("This is Renault %s, powered by %s ccm and %s horsepower %s engine.",
                getCarModel(), getEngineCapacity(), getEnginePower(), getCarEngineType()));
    }

    @Override
    public void nativeCarInfo() {
        System.out.println(String.format("Renault %s, spécifications du moteur: type: %s, capacité: %s, puissance: %s.",
                getCarModel(), getCarEngineType(), getEngineCapacity(), getEnginePower()));
    }
}

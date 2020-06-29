package interfaces;

public abstract class Car {

    private String carModel;
    private String carEngineType;
    private int engineCapacity;
    private int enginePower;

    public Car (String carModel, String carEngineType, int engineCapacity, int enginePower){
        this.carModel = carModel;
        this.carEngineType = carEngineType;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
    }

    public String getCarModel(){
        return carModel;
    }

    public String getCarEngineType(){
        return carEngineType;
    }

    public int getEngineCapacity(){
        return engineCapacity;
    }

    public int getEnginePower(){
        return enginePower;
    }
}

package interfaces;

public interface CarInterface {

    void englishCarInfo();

    void nativeCarInfo();

    default void englishInfo(){
        System.out.println("This brand implements CarInterface");
    }
}
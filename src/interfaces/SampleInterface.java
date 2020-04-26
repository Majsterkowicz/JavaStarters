package interfaces;

public interface SampleInterface {

    String PROPERTY = "test_property";

    void doSomething();

    //od javy 8
    default String provideSomeString() {
        return "string from " + providePartOfString();
    }

    //od javy 9
    private String providePartOfString() {
        return "default method";
    }

    //od javy 8(?)
    static void printSomething() {
        System.out.println("Pring something from static in interface");
    }
}

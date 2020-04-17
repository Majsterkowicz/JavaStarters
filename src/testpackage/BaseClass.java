package testpackage;

public class BaseClass {

    private String property;

    public BaseClass(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void doSomething() {
        System.out.println("do something");
    }

    public void someMethod() {
        System.out.println("Metoda w nadklasie");
    }
}

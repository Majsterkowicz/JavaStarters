package testpackage;

public class ChildClass extends BaseClass {

    private String property2;

    public ChildClass(String property, String property2) {
        super(property);
        this.property2 = property2;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public void doSomething2() {
        super.doSomething();
        System.out.println("do another fancy thing");
    }

    @Override
    public void someMethod() {
        System.out.println("jestesmy w podklasie");
    }
}

package testpackage;

public class TestClass {

    private int instanceField;
    public static int staticField;

    public TestClass() {
        instanceField++;
        staticField++;
    }

    public void doSomethingNonStatic() {
        System.out.println("do something non static");
    }

    public static void doSomethingStatic() {
        System.out.println("do something static");
    }

    public int getInstanceField() {
        return instanceField;
    }
}

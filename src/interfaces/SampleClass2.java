package interfaces;

public class SampleClass2  implements SampleInterface {

    @Override
    public void doSomething() {
        System.out.println("Do something in Sample Class 2");
    }

    @Override
    public String provideSomeString() {
        return "String from sample class 2";
    }
}

package interfaces;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        SampleInterface sampleClass1 = new SampleClass();
        SampleInterface sampleClass2 = new SampleClass2();

        List<SampleInterface> sampleClasses  = List.of(sampleClass1, sampleClass2);
        for (SampleInterface sampleClass : sampleClasses) {
            sampleClass.doSomething();
        }

        //klasa anonimowa - mozna zwinac do lamby
        SampleInterface sampleInterface = new SampleInterface() {
            @Override
            public void doSomething() {
                System.out.println("do something in sample interface");
            }
        };

        System.out.println(SampleInterface.PROPERTY);

        System.out.println("DEFAULT METHODS");
        for (SampleInterface sampleClass : sampleClasses) {
            System.out.println(sampleClass.provideSomeString());
        }

        SampleInterface.printSomething();

    }
}

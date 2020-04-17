package testpackage;

import java.util.*;

public class TestClass2 {

    public static void main(String[] args) {

        BaseClass baseClass = new BaseClass("asdasd");
        baseClass.someMethod();

        ChildClass childClass = new ChildClass("asdsa", "asdsa");
        childClass.someMethod();

        BaseClass baseClass2 = new ChildClass("asdasd", "asdasd");
        baseClass2.someMethod();

        List<BaseClass> baseClassList = new ArrayList<>();
        baseClassList.add(baseClass);
        baseClassList.add(childClass);

        for (BaseClass aClass : baseClassList) {
            aClass.someMethod();
        }

        baseClassList.add(1, baseClass);

//        Integer[] ints = new Integer[2];
        List<String> list = new ArrayList<>();    //1-2-55-3-4-2-3-5
        List<String> list2 = new LinkedList<>();  //1-2-55-3-4

        Map<String, String> map = new HashMap<>();



    }
}

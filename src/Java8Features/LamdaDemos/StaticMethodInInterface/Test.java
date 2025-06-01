package Java8Features.LamdaDemos.StaticMethodInInterface;

public class Test implements StaticDefaultMethod {
    public static void main(String[] args) {
        Test test = new Test();
        test.defaultMethod();

        StaticDefaultMethod.staticMethod();

        //test.staticMethod() => Cannot call thia because static methods must be called with interface name only
    }
}

package Java8Features.LamdaDemos.StaticMethodInInterface;

public interface StaticDefaultMethod {
    public default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}

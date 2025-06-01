package Java8Features.LamdaDemos.DefaultMethodsInInterfaces;

public interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

package Java8Features.LamdaDemos.DefaultMethodsInInterfaces;

public interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

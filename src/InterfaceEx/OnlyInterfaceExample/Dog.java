package InterfaceEx.OnlyInterfaceExample;

public class Dog implements Animal {

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

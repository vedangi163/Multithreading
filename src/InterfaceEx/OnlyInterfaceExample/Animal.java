package InterfaceEx.OnlyInterfaceExample;

public interface Animal {
    //whatever you define in interface is public & class implementing it must also use public
    //static methods => interfaceName.method() Animal.info()
    //default method => instance.method()      d.fur()
    //default method introduced for backward compatibility

    public static int MAX_AGE = 20;
    void sleep();


    static void info() {
        System.out.println("info()");
    }

    //default methods get inherited by the concreate class & access using instance.method()
    default void fur() {
        System.out.println("Yes, I have an fur");
    }
}

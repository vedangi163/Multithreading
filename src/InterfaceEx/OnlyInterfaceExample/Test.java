package InterfaceEx.OnlyInterfaceExample;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Cat.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        c.sleep();
        d.sleep();
//        Dog.info()
//        You cannot call static methods on concrete classes, must use interface name only
//        Thoogh you can still use concrete implementing classes to call the static final public constants
        Animal.info();


        d.fur();
        c.fur();
    }
}

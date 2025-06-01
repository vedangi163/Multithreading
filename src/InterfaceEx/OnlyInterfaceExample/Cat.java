package InterfaceEx.OnlyInterfaceExample;

public class Cat implements Animal {

    @Override
    public void sleep() {
        System.out.println("Cat is aleeping");
    }

     public void fur() {
         System.out.println("Cat is fur animal");
     }
}

package InterfaceEx;

public class MultipleInhertClass {
    public static void main(String[] args) {
        //C c = new C();
        //c.show(); JVM complains which method to call A's or B's
    }
}


class A {
    void show() {
        System.out.println("A");
    }
}

class B {
    void show() {
        System.out.println("B");
    }
}

/*
    Since JVM complains which method to call A,s or B's, now we override it in C class but lets
    what will you do if there are some variables & you want an use case like this, where you must call
    A or B's show(), to solve this problem interface introduced
 */
//class C extends A, B {
//    void show( ){ }
//}

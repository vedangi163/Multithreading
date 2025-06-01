package InterfaceEx;
public class InterfaceMultipleEx {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

interface AI {
    default void show() {
        System.out.println("AI");
    }
}

interface BI {
    default void show() {
        System.out.println("BI");
    }
}

//V.V.V.V. Imp=> if you do not provide implementation for show(), it will complaint that I have 2 implentations
//of show() which one to call ? hence we override & then call A.super.show();
class C implements AI, BI {
    public void show() {
        BI.super.show();                           //resolve ambiguity
    }
}


//interface NoDefaultMethodOverride{
//    default void show() {
//
//    }
//}
//
//No need to override here anything, bcoz its default methods do not overriding
//Only only need in case of ambiguity
//class Test implements NoDefaultMethodOverride {
//
//}
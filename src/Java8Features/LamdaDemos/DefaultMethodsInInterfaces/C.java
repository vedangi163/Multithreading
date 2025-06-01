package Java8Features.LamdaDemos.DefaultMethodsInInterfaces;

import Java8Features.LamdaDemos.StaticMethodInInterface.StaticDefaultMethod;

public class C implements A, B, StaticDefaultMethod {
    /*
        If 2 interfaces with default method then, one class implementing both of them then class must override it & tell
        which implementations are you using
     */

    @Override
    public void show() {
        B.super.show();          //must override show() as 2 show() implementations are coming from A and from B
    }

    public static void main(String[] args) {
        C cObj = new C();
        cObj.show();
    }
}

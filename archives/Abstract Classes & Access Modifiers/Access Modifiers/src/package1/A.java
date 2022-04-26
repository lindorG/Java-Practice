package package1;
import package2.*;

public class A {

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.publicMessage);

        B b = new B();

//        The code below cannot run because the member being printed is private
//        System.out.println(b.privateMessage);


//        The code below cannot compile and run because it is using
//        the default access modifiers seen above

//        C c = new C();
//        System.out.println(c.defaultMessage);
    }
}

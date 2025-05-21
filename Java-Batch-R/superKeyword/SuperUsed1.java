package superKeyword;
class A {
    String name = "Aditya";
}

class B extends A {
    String name = "hello Aditya";

    void show() {
        System.out.println(name);
        System.out.println(super.name);
    }

}

public class SuperUsed1 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
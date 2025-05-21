package abstractClasses;
abstract class A {
    abstract void show();// abstract method always declare
}

class B extends A {
    void show() {
        System.out.println("abstract method used ");
    }
}

public class AbstractClassCase1 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
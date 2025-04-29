package anonymous;
abstract class A {
    abstract void show();
}

interface B {
    void show1();
}

public class AnonymousClass {
    public static void main(String[] args) {
        A k = new A() {
            void show() {
                System.out.println("abstract method");
            }
        };
        k.show();
        B p = new B() {
            public void show1() {
                System.out.println("interface method");
            }
        };
        p.show1();
    }
}
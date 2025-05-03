package covariant;
class A {
    int show() {
        int a = 98;
        return a;
    }

    // covariant return type
    A show1() {
        System.out.println("covariant A class");
        return this;
    }

}

class B {
    int show() {
        int num = 67;
        return num;
    }

    B hello() {
        System.out.println("b class covariant");
        return this;
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        A p=new A();
        System.out.println(p.show());
        p.show1();

        B k=new B();
        System.out.println(k.show());
        k.hello();
    }
}
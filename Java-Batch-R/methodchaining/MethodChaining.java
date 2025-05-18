package methodchaining;
class A {
    void show1() {
        System.out.println("show1 method");
    }

    void show2() {
        show1();
    }

    void show3() {
        show2();
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        A p = new A();
        p.show3();
    }
}

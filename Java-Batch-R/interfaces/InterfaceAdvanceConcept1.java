package interfaces;
interface AB {
    class B {
        void show() {
            System.out.println("B class method");
        }
    }
}

class CB extends AB.B {
    void show1() {
        System.out.println("class");
    }
}

public class InterfaceAdvanceConcept1 {
    public static void main(String[] args) {
        CB p = new CB();
        p.show();
        p.show1();
    }
}
package gettersetter;
class AB {
    int a;
    int b;

    void setA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getA() {
        return a;
    }

    int getA1() {
        return b;
    }

    void add() {
        System.out.println(a + b);
    }
}

public class GetterAndSetterAdd {
    public static void main(String[] args) {
        AB p = new AB();
        p.setA(1, 1);
        p.getA();
        p.getA1();
        p.add();
    }
}
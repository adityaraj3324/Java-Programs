package gettersetter;
class A {
    int a;

    void setA(int a) {

        this.a = a;
    }

    // return
    int getA() {
        return a;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        A p = new A();
        p.setA(67);
        System.out.println(p.getA());
    }
}

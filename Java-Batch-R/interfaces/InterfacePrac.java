
interface A{
    class B{
        public B(){}
        void show(){
            System.out.println("Hello");
        }
    }
}
class InterfacePrac extends A.B{
    void show1(){
        System.out.println("World");
    }
    public static void main(String[] args) {
        A.B p = new InterfacePrac();
        p.show();
    }
}
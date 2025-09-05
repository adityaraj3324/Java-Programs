package aditya;
class A extends RuntimeException{
    public A(String a){
        System.out.println(a); //no exception convert manually
    }
}
public class ThrowCase7 {
    public static void main(String[] args){
        try {
            //manually exception create through throw and create a custom exception
            throw new A("Exception Practice");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
package exceptionhandling;
public class ExceptionBasic1 {
    public static void main(String[] args) {
       try{
        int a=9/0;
        System.out.println(a);
       }
       catch(ArithmeticException ex){//class refrence_varaible 
        System.out.println("exception handle");
       }
    }
}
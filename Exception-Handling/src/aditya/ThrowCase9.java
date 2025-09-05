package aditya;
class D{
    public static void voterid(int age){
        //when user age is less than 18 :throw exception otherwise valid
        //create exception
        if(age<18){
            throw new ArithmeticException("you are not valid");
        }
        else{
            System.out.println("valid");
        }
    }
}
public class ThrowCase9 {
    public static void main(String[] args) {
        D.voterid(4);
    }
}
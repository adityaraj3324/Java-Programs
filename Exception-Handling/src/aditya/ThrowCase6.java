package aditya;

class C extends RuntimeException{
    public static void voterid(int age){
        //when user age is less than 18 :throw exception otherwise valid
        //create exception
        if(age<18){
                throw new C();
        }
        else{
            System.out.println("valid");
        }
    }
}
public class ThrowCase6 {
    public static void main(String[] args) {
//        C.voterid(4);    // it will give error because we are not handling it
          C.voterid(18);  // Works fine
        System.out.println("Bacha hua code");
    }
}
package aditya;

class B{
    public static void voterid(int age){
        //when user age is less than 18 :throw exception otherwise valid
        //create exception
        if(age<18){
            try {
                throw new MyException("tum abhi chirkut ho, boyy!");
            }
            catch(MyException e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("valid");
        }
    }
}
public class ThrowCase8 {
    public static void main(String[] args) {
        B.voterid(4);
        System.out.println("Rest of the code");
    }
}
class Animal{
    public void dog(){
        System.out.println("Dog");
    }
    public void cat(){
        System.out.println("Cat");
    }
}
class Sound extends Animal{
    public void dog(){
        System.out.println("Bhow");
    }
    public void cat(){
        System.out.println("Meow");
    }
}
public class Practice {
    public static void main(String[] args){
        Animal a = new Sound();
        a.cat();
        a.dog();
//        a.bark();
    }
}

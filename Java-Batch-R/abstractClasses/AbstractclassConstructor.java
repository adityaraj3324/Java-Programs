package abstractClasses;
abstract class AB {
    AB() {
        System.out.println("hello");
    }
}

class BA extends AB {
    BA() {
        System.out.println("world");
    }
}

public class AbstractclassConstructor {
    public static void main(String[] args) {
    //make constructor in abstract class constructor and does not call the constructor 
        new BA();
    }
}

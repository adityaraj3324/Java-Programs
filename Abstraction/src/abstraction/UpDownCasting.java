package abstraction;
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void shit() {
        System.out.println("Animal is shitting");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting (automatic)
        a.eat();
        a.shit();
     //   a.bark(); // throws error
        Dog d = (Dog) a; // Downcasting (manual)
        
        d.eat();   // From Animal
        d.bark();
        d.shit();// From Dog
    }
}

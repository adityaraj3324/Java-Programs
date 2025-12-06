class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class TOSTRING {
    public static void main(String[] args) {

            Student s1 = new Student("Aditya", 20);

            System.out.println(s1);
            System.out.println(s1.toString());   
        }
    }




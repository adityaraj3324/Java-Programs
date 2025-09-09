
class Abc extends Thread{
    public void start(){

        for(int i=0;i<3;i++) {
            System.out.println("Class Thread is running");

        }
    }
}

public class MultiThreading03 {
    public static void main(String[] args) {
        Abc ab = new Abc();
        Thread th = new Thread(ab);
        th.start();
        ab.start();
        for(int i=0;i<3;i++) {
            System.out.println("Main Thread is running");

        }

    }
}

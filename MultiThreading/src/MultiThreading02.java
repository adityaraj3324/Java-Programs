class A extends Thread{
    public void run(){

        for(int i=0;i<3;i++) {
            System.out.println("Class Thread is running");

        }
    }
}

public class MultiThreading02 {
    public static void main(String[] args) {
        A a = new A();
        Thread th = new Thread(a);

        th.start();
        for(int i=0;i<3;i++) {
            System.out.println("Main Thread is running");

        }

    }
}

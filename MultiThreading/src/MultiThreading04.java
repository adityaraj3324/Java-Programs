
class ABCD extends Thread{
    public void run(){
         System.out.println("Class Thread is running");
         Thread t = new Thread();
         System.out.println(t.getName());
    }
}

class ABCDE implements Runnable{
    public void run(){
            System.out.println("Runnable Thread is running");
        Thread t = new Thread();
        System.out.println(t.getName());
    }
}

public class MultiThreading04 {
    public static void main(String[] args) {
        ABCD ab = new ABCD();
        Thread th1 = new Thread(ab);
        th1.start();


        ABCDE aa = new ABCDE();
        Thread th = new Thread(aa);
        th.start();

        System.out.println("Main Thread is running \n"+ Thread.currentThread().getName());
    }
}

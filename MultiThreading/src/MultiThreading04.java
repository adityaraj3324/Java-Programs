
class ABCD extends Thread{
    public void run(){
         System.out.println("Class Thread is running\n"+ Thread.currentThread().getName());
    }
}

class ABCDE implements Runnable{
    public void run(){
            System.out.println("Runnable Thread is running\n"+ Thread.currentThread().getName());
    }
}

public class MultiThreading04 {
    public static void main(String[] args) {
        ABCD ab = new ABCD();
        ab.start();     // No need to create an additional object of Thread class bcz it already extends it

        ABCDE aa = new ABCDE();
        Thread th = new Thread(aa);     // but in case of Runnable you need to create an object for the Thread class
        th.start();

        System.out.println("Main Thread is running \n"+ Thread.currentThread().getName());
    }
}

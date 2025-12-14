class TT extends Thread{
    public void run(){
        System.out.println("thread is running");
        Thread t1 = Thread.currentThread();
        System.out.println("Thread Name: "+t1.getName());
    }
}
public class MyThread{
    public static void main(String[] args){
        System.out.println("Thread start");
        Thread t1 = Thread.currentThread();
        System.out.println("Thread Name: "+t1.getName());
        TT tt = new TT();
        tt.start();
        try {
            Thread.sleep(2000);
        }catch(Exception e){};

        System.out.println("Thread Terminate");
    }
}




class MultiThreading01{

public static void main(String[] args) {
    AB ab = new AB();
    Thread th = new Thread(ab);
    th.start();
}
}
class AB extends Thread{
    public void run(){
        System.out.print("Thread is running");
    }
    public void run2(){
        System.out.print("Thread2 is running");
    }
}
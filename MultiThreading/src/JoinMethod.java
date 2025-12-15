public class JoinMethod{
    public static void main (String argvs[])  {

        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

        th1.start();

        try {
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
            th1.join();
        }
        catch(Exception e)  {  }
        th2.start();
        try  {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th2.join();
        }
        catch(Exception e)  { }
        th3.start();
    }
}

class ThreadJoin extends Thread  {
    public void run()  {
        for (int j = 0; j < 2; j++)  {
            try{
                Thread.sleep(1000);
                System.out.println("The current thread name is: " + Thread.currentThread().getName()+" "+j);
            }
            catch(Exception e) {}
        }
    }
}


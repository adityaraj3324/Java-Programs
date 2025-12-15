class ThreadNotify {
    public static void main(String[] args) throws Exception {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread waiting...");
                    lock.wait();
                    System.out.println("Thread resumed");
                } catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {

                lock.notify();
                System.out.println("Thread notifying...");
            }
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}

public class Task10 {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t1 = new Thread(new Print(true, lock, 1),"A");
        Thread t2 = new Thread(new Print(false,lock, 2),"B");
        t2.start();
        t1.start();
    }
}
    class Print implements Runnable {
        private boolean run;
        private Object lock;
        private int num;

        public Print(boolean runnow, Object lock, int num) {
            this.run = runnow;
            this.lock = lock;
            this.num = num;
        }
        @Override
        public void run(){
            synchronized (lock){
                while(num<=100){
                    if(run){
                        run=false;
                    }
                    else{
                        try{
                            lock.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " +num);
                    num+=2;
                    lock.notify();
                }
            }
        }
    }


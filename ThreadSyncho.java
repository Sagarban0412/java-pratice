
class ThrA implements Runnable{
        private final Object lock;

    public ThrA(Object lock) {
        this.lock = lock;
    }
    public void run(){
         synchronized (lock){
        for(int i=1;i<=3;i++){
            System.out.println("ThrA:"+ i);
        }
    }
}
   
    }

class ThrB implements Runnable{
        private final Object lock;

    public ThrB(Object lock) {
        this.lock = lock;
    }
    public void run(){
         synchronized (lock){
        for(int j=1;j<=3;j++){
            System.out.println("ThrB:"+ j);
        }
    }
}
   
    }
class ThrC implements Runnable{
    private final Object lock;
    public ThrC(Object lock){
        this.lock=lock;
    }
    public void run(){
        synchronized (lock){
            for(int k=1;k<=3;k++){
                System.out.println("Thr3: "+ k);
            }
        }
    }
}

class ThreadSyncho{
    public static void main(String[] args){
        Object lock = new Object();
        Thread t1 = new Thread(new ThrA(lock));  
        Thread t2 = new Thread(new ThrB(lock));  
        Thread t3 = new Thread(new ThrC(lock));  
        t1.start();
        t2.start();
        t3.start();
    }
}
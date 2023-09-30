// import java.lang.Thread;
class ThreadD extends Thread{
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println("threadA:"+i);
        }
    }
}
class ThreadE extends Thread{
    public void run(){
        for(int j=1;j<3;j++){
            System.out.println("threadB:"+j);
        }
    }
}
class ThreadF extends Thread{
    public void run(){
        for(int k=1;k<3;k++){
            System.out.println("threadC:"+k);
        }
    }
}

public class ThreadPriority {
    int MIN_PRIORITY=1;
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD();
        ThreadE t2 = new ThreadE();
        ThreadF t3 = new ThreadF();
        //thread prority in java....
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(t1.getPriority()+1);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
    
}

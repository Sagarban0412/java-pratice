class ThreadA extends Thread{
    public void run(){
        for( int i=1;i<=5;i++){
            System.out.println("thread "+ i);
            if(i==3){
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            
        }
        System.out.println("thread A Exit");
    }
}
class ThreadB extends Thread{
    public void run(){
        for( int j=1;j<=5;j++){
            System.out.println("thread "+ j);
        }
        System.out.println("thread B Exit");
    }
}
class ThreadC extends Thread{
    public void run(){
        for( int k=1;k<=5;k++){
            System.out.println("thread "+ k);
        }
        System.out.println("thread C Exit");
    }
}
class Thread1{
    public static void main(String[] args){
        Thread t1= new Thread(new ThreadA());
        Thread t2= new Thread(new ThreadB());
        Thread t3= new Thread(new ThreadC());
        t1.start();
      
        
        t2.start();
        t3.start();
    }
}
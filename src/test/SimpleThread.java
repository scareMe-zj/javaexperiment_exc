package test;

public class SimpleThread extends Thread{
    public SimpleThread(String str){
        super(str);//set the thread's name
    }
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println(getName() + ":" + i);
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
            System.out.println(getName()+":Done");
        }
        }
}


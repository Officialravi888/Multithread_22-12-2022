package Maltithread;
//6. public final void setPriority()


public class Test6 extends Thread{
    public void run() {
        System.out.println("Pority of the Thread:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Test6 obj1=new Test6();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
    }
}

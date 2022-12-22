package Maltithread;

public class Test2 extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);}
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Test2 obj=new Test2();
        Thread t2=new Thread(obj);
        t2.start();
    }
}

package Maltithread;
//11. public final boolean isAlive()
public class Test10 extends Thread {
    public void run() {
        System.out.println("running...........");

        try {
            Thread.sleep(899);
            System.out.println(":"+Thread.currentThread().isAlive());
        } catch (InterruptedException e) {

        }
    }
    public static void main(String[] args) {
        Test10 obj= new Test10();
        obj.start();
        System.out.println(":"+obj.getName());
        System.out.println(":"+obj.isAlive());
    }
}

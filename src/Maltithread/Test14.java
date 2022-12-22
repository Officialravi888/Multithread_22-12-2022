package Maltithread;
//15. public final void stop()
public class Test14 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(67);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test14 obj =  new Test14();
        obj.start();
        Test14 obj2 = new Test14();
        obj2.stop();
        System.out.println("running...");
    }

}

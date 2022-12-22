package Maltithread;
//14. public final void resume()
public class Test13 extends Thread {
    public void run() {
        for (int i = 0; i <4; i++) {
            try {
                Thread.sleep(234);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test13 obj=new Test13();
        obj.start();
        Test13 obj2=new Test13();
        obj2.resume();
    }
}
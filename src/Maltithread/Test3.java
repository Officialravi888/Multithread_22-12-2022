package Maltithread;

public class Test3 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test3 obj = new Test3();
        Test3 obj1=new Test3();
        obj.start();
        obj1.start();
    }
}

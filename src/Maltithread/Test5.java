package Maltithread;

public class Test5 extends Thread{
    public void run() {
        System.out.println("Running name Thread:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test5 obj1=new Test5();
        obj1.start();
        System.out.println("obj1 thread pority:"+ obj1.getName());
    }
}

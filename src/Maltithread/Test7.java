package Maltithread;
//8. public final String getName()
public class Test7 extends Thread{
    public void run() {
        System.out.println("Thread is running...........");
    }

    public static void main(String[] args) {
        Test7 obj2= new Test7();
        obj2.start();
        System.out.println("Name of thread:"+obj2.getName());
    }
}

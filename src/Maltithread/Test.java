package Maltithread;

public class Test extends Thread {
    public void run(){
        System.out.println("System executed-----------");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        Thread t1= new Thread(obj);
        t1.start();
    }
}

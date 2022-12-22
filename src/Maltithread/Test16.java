package Maltithread;
//17. public final boolean isDaemon()
public class Test16 extends Thread{
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Demone work");
        } else {
            System.out.println("use thread work");
        }
    }
    public static void main(String[] args) {
        Test16 obj=new Test16();
        obj.start();
        Test16 obj1=new Test16();
        obj1.setDaemon(true);
    }
}

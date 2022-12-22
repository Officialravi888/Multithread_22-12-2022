package Maltithread;
//12. public static void yield()
public class Test11 extends Thread{
    public void run() {
        for(int i=0; i<3; i++)
        System.out.println(Thread.currentThread().getName()+"in control");
    }
    public static void main(String[] args) {
        Test11 obj = new Test11();
        Test11 obj1=new Test11();
        obj1.start();
        obj.start();
        for(int i=0; i<3; i++){
            obj.yield();
        }
        System.out.println(Thread.currentThread().getName()+"in control");
    }
}

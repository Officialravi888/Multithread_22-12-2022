package Maltithread;
//13. public final void suspend()
public class Test12 extends Thread{
    public void run() {
        for (int i=0; i<3; i++){
            try {
                Thread.sleep(1466);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {System.out.println(e);}
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Test12 obj=new Test12();
        Test12 obj1=new Test12();
        Test12 obj2 =new Test12();
        obj.start();
        obj1.suspend();
        obj2.start();
    }
}

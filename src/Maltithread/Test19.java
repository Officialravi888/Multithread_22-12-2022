package Maltithread;
//20. public boolean isInterrupted()
public class Test19 extends Thread{
    public void run() {
        for(int i=0; i<=3; i++){
            System.out.println("doing task..."+i);
        }

    }

    public static void main(String[] args) {
        Test19 obj1=new Test19();
        obj1.start();
        System.out.println("Thread interpreter:"+obj1.isInterrupted());
    }
}

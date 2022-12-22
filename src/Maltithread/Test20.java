package Maltithread;
//21. public static boolean interrupted()
//////22. public static int activeCount()
public class Test20 extends Thread{
    Test20(String Threadname){
        super(Threadname);
        start();
    }
    public void run() {

            System.out.println("Running thread name:"+Thread.currentThread().getName());
        }

    public static void main(String[] args) {
        Test20 obj1 = new Test20("prent thread group");
        obj1.start();
        System.out.println("number of active thread: "+ obj1.activeCount());

    }
    }


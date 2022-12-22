package Maltithread;
//18. public final void setDaemon(boolean on)
public class Test17 extends Thread{
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("demain is work");
        } else {
            System.out.println("demain not work");
        }
    }
    public static void main(String[] args){
        Test17 obj= new Test17();
        obj.start();
        Test17 obj2=new Test17();
        obj.setDaemon(true);
        }
}

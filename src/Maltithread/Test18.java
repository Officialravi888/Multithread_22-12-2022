package Maltithread;
//19. public void interrupt()
public class Test18 extends Thread{
    public void run() {
        try {
            Thread.sleep(67);
        } catch (InterruptedException e) {
            throw new RuntimeException("thread interpreted"+e);
        }
    }

    public static void main(String[] args) {
        Test18 obj= new Test18();
        obj.start();
        try {
            Thread.sleep(23);
        } catch (Exception e) {
            System.out.println("Execption thread"+e);

        }
    }
}

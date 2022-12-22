package Maltithread;
//16. public void destroy()
public class Test15 extends Thread {
    public void run() {
        for (int i = 2; i < 45; i++) {
            try {
                Thread.sleep(24);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException, SecurityException {
        {
            ThreadGroup g1 = new ThreadGroup("Parent thread");
            ThreadGroup g2 = new ThreadGroup(g1, "child thread");
            JavaDestroyExp thread1 = new JavaDestroyExp("Thread-1", g1);
            JavaDestroyExp thread2 = new JavaDestroyExp("Thread-2", g1);
            thread1.join();
            thread2.join();
            g2.destroy();
            System.out.println(g2.getName() + " destroyed");
            g1.destroy();
            System.out.println(g1.getName() + " destroyed");

        }
    }
}

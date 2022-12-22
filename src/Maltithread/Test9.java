package Maltithread;
//10. public long getId()
public class Test9 extends Thread{
    public void run() {
        System.out.println("running.......");
    }

    public static void main(String[] args) {
        Test9 obj2= new Test9();
        obj2.start();
        System.out.println("name of thread:"+obj2.getName());
        System.out.println("Id of thread:"+obj2.getId());
    }
}

package Maltithread;
//9. public final void setName()
public class Test8 extends Thread{
    public void run() {
        System.out.println("running.............");
    }

    public static void main(String[] args) {
        Test8 obj2=new Test8();
        obj2.start();
        obj2.getName();
        obj2.setName("Ravi kant");
        System.out.println("After the channing Thread:"+obj2.getName());
    }
}

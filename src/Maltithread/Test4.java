package Maltithread;
////mun
public class Test4 extends Thread{
    public void run() {
        for (int i=0; i<=10; i++){
            try {
                Thread.sleep(19990);
            } catch (Exception e) {
                System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test4 obj=new Test4();
        obj.start();
//        try {
//            obj.join(1200);
//        } catch (Exception e) {
//            System.out.println(e);
//            obj.start();

       // }
    }
}

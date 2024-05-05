public class JavaThreadRunnable implements Runnable{
    public void run(){
        System.out.println("Thread running, using Runnable Interface");
    }
public static void main(String[] args) {
    JavaThreadRunnable obj1= new JavaThreadRunnable();
    Thread t = new Thread(obj1);
    t.start();
}
}
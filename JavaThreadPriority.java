
public class JavaThreadPriority  extends Thread{
 
    public void run(){
        System.out.println("Thread running, using Thread Class");
      }
      public static void main(String[] args){
          JavaThreadClass obj1= new JavaThreadClass();
          obj1.start();
      }
  
  }

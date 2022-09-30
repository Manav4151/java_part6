//21CE097 Manav Patel 
//Write a program to create thread which display “Hello World” message. A. by extending Thread class B. by using Runnable interface
// GitHub : https://github.com/Manav4151/java_part6.git

class ThreadDemo extends Thread {
    public void run() {
    System.out.println("Hello world from Thread class");
   }
}
class RunnableDemo implements Runnable {

   public void run() {
       System.out.println("Hello world from Runnable Interface");
   }
}
public class prac1_6{
   public static void main(String[] args) {
       ThreadDemo t = new ThreadDemo();
       Thread r = new Thread(new RunnableDemo());
       t.start();
       r.start();
   }
}

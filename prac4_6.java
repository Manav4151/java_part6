//21CE097 Manav Patel
//Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7
// GitHub : https://github.com/Manav4151/java_part6.git 
class Mythread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }
}

public class prac4_6 {

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.setName("First");
        t2.setName("Second");
        t3.setName("Third");
        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
    }
}


    


//21CE097 Manav Patel
//Write a program to increment the value of one variable by one and display it after one second using thread using sleep() method.
// GitHub : https://github.com/Manav4151/java_part6.git 
import java.util.*;

class Mythread extends Thread
{
    int a;
    Mythread(int a)
    {
        this.a = a;
    }
    public void increment()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(++a);
            try
        {
            sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // sleep(1000);
        }
    }
    public void run()
    {
        increment(); 
    }
}
public class prac3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        Mythread m = new Mythread(a);
        m.start();
    }
}
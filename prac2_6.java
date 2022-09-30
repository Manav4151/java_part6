//21CE097 Manav Patel
//Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to display the numbers stored at odd indexes by thread1 and display numbers stored at even indexes by thread2.
// GitHub : https://github.com/Manav4151/java_part6.git 
import java.util.*;
class Odd extends Thread{
    int arr[] = new int[15];
    Odd(int []arr)
    {
        for(int i=0;i<15;i++)
        {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<15;i++)
        {
            if(arr[i]%2 != 0)
            {
                System.out.println("Odd number is:- "+arr[i]);
            }
        }
    }
}

class Even extends Thread
{
    int arr[] = new int[15];
    Even(int [] arr)
    {
        for(int i=0;i<15;i++)
        {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<15;i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println("Even number is:- "+arr[i]);
            }
        }
    }
}
public class prac2_6 {
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        int arr[] = new int[15];
        Random x = new Random();
        for(int i=0;i<15;i++)
        {
            arr[i] = x.nextInt(100);
        }
        Odd on = new Odd(arr);
        Even en = new Even(arr);

        on.start();
        en.start();
    }
}
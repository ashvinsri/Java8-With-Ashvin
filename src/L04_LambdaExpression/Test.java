/**
 *   Usually we have used first method in multi threading concept but in java 8 we will use lambda expression as Runnable is functional Interface.
 * 
*/
package L04_LambdaExpression;
import java.util.*;
/**
 *
 * @author DELL-PC
 */


class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("Hello");
    }
}
public class Test {
    public static void main(String args[])
    {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
            System.out.println("Hi");
        
    }
}
class Lambda
{
    public static void main(String args[])
    {
        Runnable r=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("Child Thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}








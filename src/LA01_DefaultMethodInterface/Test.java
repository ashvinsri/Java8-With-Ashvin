/**
 *   Suppose an interface has two methods m1() and m2() and 10 classes are implementing it then in all classes we have to define it.
 *   Now let us suppose we have declared third method m3() in interface then now we have to define m3() in each of the 10 classes whether needed or not so to remove this work load 
 *   we have default method
 *   
 * 
 * 
 */
package LA01_DefaultMethodInterface;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
interface Interf
{
    public void m1();
    public void m2();
    default void m3(){
        System.out.println("default method");
    }
}
class A implements Interf
{
    public void m1()
    {
        System.out.println("A m1");
    }
     public void m2()
    {
        System.out.println("A m2");
    }
}
class B implements Interf
{
    public void m1()
    {
        System.out.println("B m1");
    }
     public void m2()
    {
        System.out.println("B m2");
    }
}
class C implements Interf
{
    public void m1()
    {
        System.out.println("C m1");
    }
     public void m2()
    {
        System.out.println("C m2");
    }
    public void m3()
    {
        System.out.println("default method defined in C");
    }
}
public class Test {
    public static void main(String args[])
    {
        C c=new C();
        c.m1();
        c.m2();
       
        // You can call default method from any class
        
        A a = new A();
        a.m3();
        
        //You can override default method also
        c.m3();
        
        //Dynamic Method Dispatch
        Interf i=new C();
        i.m3();
        
    }
}

/**
 *   Functional Interface ::--> Interface which contains only one abstract method is called functional Interface
 *   Runnable ==> run();
 *   Callable ==> call();
 *   It can contain static and default method
 * 
 */
package L01_FunctionalInterface;

/**
 *
 * @author DELL-PC
 */


@FunctionalInterface
interface interf1{
    public void m1();
    //public void m2();
    public static void m2(){
        
    }
    
}
//@FunctionalInterface
interface interf2{
    //public void m2();
    public static void m2(){
        
    }
    
}
@FunctionalInterface
interface interf3{
    public void m1();
}

///////  Inheritance wrt Functional Interface/////////
@FunctionalInterface
interface A
{
    public void m1();
}
@FunctionalInterface
interface B extends A{
    //public void m1();                 no problem if u r overriding the previous method but there is problem if u r making new method
   // public void m2();
}

class As implements A{
    public void m1()
    {
        System.out.println("Hello I am in m1");
    }
}
public class Test {
    public static void main(String args[])
    {
        As a =new As();
        a.m1();
    }
    
}

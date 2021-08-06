/**
 *   Suppose we are making a class with all static method no concrete method then what is the need of class ???????
 *   better to use Interface with static method which is available in Java 8   
 * 
 */
package LA03_StaticMethodInJava;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

interface Interf
{
    static void m1(){
        System.out.println("static m1() method from Interf");
    }
}
//public class Test {
//    public static void main(String args[])
//    {
//        Interf.m1();
//        
//    }
//}

public class Test implements Interf
{
    public static void main(String args[])
    {
        Interf.m1();
        // Test.m1(); wrong we can't call interface static method from implementation class
        Test t=new Test();
        // t.m1(); this is also wrong in case of Interface static method
    }
}

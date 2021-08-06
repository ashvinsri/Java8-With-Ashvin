/**
 *  Multiple Inheritance is not supported in JAVA as it creates an ambiguity or we can say confusion or we can say diamond problem if both parent class contain method with same name 
 *  then compiler is confused which method it should call?
 * 
 */
package LA02_MultipleInheritanceInJava;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

class A{
    public void m1()
    {
        System.out.println("m1 from A");
    }
}
class B{
    public void m1()
    {
        System.out.println("m1 from B");
    }
}
//class C extends A,B
//{
//          so it is not supported in java okkkkkkkkkkkkkk
//}
/**
 *   So how this problem is resolved?? actually this problem is resolved in java 8 by default method now lets define two interfaces A and B both having m1() method and try to implement in
 *   the class. 
 */
interface Left{
    default void m1()
    {
        System.out.println("m1 from Left");
    }
}
interface Right{
    default void m1()
    {
        System.out.println("m1 from Right");
    }    
}

//class LR implements Left,Right            """" It is also raising error now what to do??? We have listened so much that multiple inheritance problem is solved 
//{                                              by default method in java but here it is raising unrelated m1() error""""    
//    
//}

interface Left1{
    default void m1()
    {
    System.out.println("m1 from Left1");
    }
}
interface Right1{
    default void m1()
    {
    System.out.println("m1 from Left1");
    }
}
class LeftRight implements Left1,Right1              ///  """ Here we have no error so it is compulsary to override the ambiguous default method in the implementation class""" 
{                                                    ///  """ Give it your own definition or just call super method for Left and Right""" 
    
//    public void m1()
//    {                             
//        System.out.println("My own m1()");
//    }
    public void m1()
    {                             
       Left1.super.m1();                             //""""Call as per ur wish if u dont want to give ur implementation""""
    }
}
public class Test {
    public static void main(String args[])
    {
        LeftRight lr=new LeftRight();
        lr.m1();
    }
}

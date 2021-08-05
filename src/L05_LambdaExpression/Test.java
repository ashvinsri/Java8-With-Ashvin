/**
 * 
 * Haan! Do you remember comparator in array list?? yes actually we use comparator class which implements the functional interface Comparable and has only one function public int compare()...
 * 
 * But here ownwards we are not declaring seperate class but we will use lambda expression inside ArrayList Constructor
 * 
 */
package L05_LambdaExpression;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
class MyComparator implements Comparator<Integer>
{
    public int compare(Integer obj1,Integer obj2)             
    {
        return obj2-obj1;                                   //- obj1 will come before obj2           + -> obj2 will come before obj1;
    }
}

public class Test {
    public static void main(String args[])
    {
       ArrayList<Integer> al=new ArrayList<Integer>();
       al.add(10);
       al.add(5);
       al.add(45);
       al.add(8);
       System.out.println(al);
       Collections.sort(al,new MyComparator());
       System.out.println(al);
    }
}
class Lambda {
    public static void main(String args[])
    {
       ArrayList<Integer> al=new ArrayList<Integer>();
       al.add(10);
       al.add(5);
       al.add(45);
       al.add(8);
       System.out.println(al);
       Comparator<Integer> c=(Integer i1,Integer i2)->{return ((i2>i1)?-1:(i1>i2)?1:0);};
       Comparator<Integer> c1=(Integer i1,Integer i2)->(i2>i1)?+1:(i1>i2)?-1:0;
       Collections.sort(al,c);
       System.out.println(al);
       Collections.sort(al,c1);
       System.out.println(al);
    }
}








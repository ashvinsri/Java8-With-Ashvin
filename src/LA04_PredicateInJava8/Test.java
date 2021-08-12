/**
 *    Predicate---> is a functional interface which is used for conditional checking. It contains an abstract test method which is used to check the condition.
 * 
 *    Predicate is present inside java.util.function package 
 *    
 *    interface Predicate<T>{
 *      
 *       public abstract boolean test(T t);
 *     }
 * 
 */
package LA04_PredicateInJava8;
import java.util.function.*;
/**
 *
 * @author DELL-PC
 */

class Employee{
    String name;
    int salary;
    int id;
    Employee(String n,int s,int i)
    {
        this.name=n;
        this.salary=s;
        this.id=i;
    }
}
public class Test {
    public static void main(String args[])
    {
        
        // Integer
    Predicate<Integer> p1=i->i%2==0;             // To check if it is even or not
    System.out.println(p1.test(10));
       // Our Own Class
    Employee emp=new Employee("Ashvin",12000,4);
    Predicate<Employee> p2=e->e.salary>10000 && e.id<5;
    System.out.println(p2.test(emp));
    
       //String array Print only those element whose length>=5
    String st[]={"Ashvin","Supreet","Visu","Vasu","Yashu"};
    Predicate<String> p3=s->s.length()>=5;
    for(String s:st)
    {
        if(p3.test(s))
        {
            System.out.print(s+" ");
        }
    }
    }
}

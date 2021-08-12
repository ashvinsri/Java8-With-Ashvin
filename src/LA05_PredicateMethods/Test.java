/**
 *   Predicate and (Predicate Other)----> used for chaining two predicates means if two conditios are met or not
 *   Predicate negate()----> returns predicte which is negation of given predicate
 *   Predicate or(Predicate other)---> returns predicate which is or of two predicates
 * 
 *    p1---> check whether number is even or not
 *    p2---> check whether number is greater than 10 or not
 *    now combine both conditions
 *    p3=p1.and(p2).test(12);
 * 
 * 
 */
package LA05_PredicateMethods;
import java.util.function.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        
        // and()
        Predicate<Integer> p1=i->i%2==0;
        Predicate<Integer> p2=j->j>10;
        System.out.println(p1.and(p2).test(9));
        
        //negate()
        Predicate<Integer> p3= p1.negate().and(p2);   //Here if number is odd and greater than 10
        System.out.println(p3.test(13));
    }
    
}

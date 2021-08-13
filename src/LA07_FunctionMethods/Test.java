/**
 * In Function we have 3 methods FIrst one is:-------
 * f1---> Calculate twice 
 * f2---> Calculate square
 * f1.andThen(f2)       f1 is applied followed by f2
 * 
 * f1---> Calculate twice 
 * f2---> Calculate square
 * f1.compose(f2)       f2 is applied followed by f1
 */
package LA07_FunctionMethods;
import java.util.*;
import java.util.function.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[]){
        Function<Integer,Integer> f1 = i->2*i;
        Function<Integer,Integer> f2 = i->i*i;
        System.out.println(f1.andThen(f2).apply(10));   //First f1 is calculated then f2
        
        
        Function<Integer,Integer> f3 = i->2*i;
        Function<Integer,Integer> f4 = i->i*i;
        System.out.println(f3.compose(f4).apply(20)); //First f2 is calculated then f1
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L03_LambdaExpression;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
interface interf{
    public void m1();
}
public class Test {
    public static void main(String args[])
    {
        interf i=()->System.out.println("Hi");
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.forEach(n->{System.out.println(n);});
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L02_LambdaExpression;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

interface Interf1
{
    public void m1();
}
interface Interf2
{
    public int m2(int a,int b);
}
public class Test {
    public static void main(String args[])
    {
        Interf1 i=()->{System.out.println("Ashvin How r u?");};
        i.m1();
        Interf2 j=(a,b)->a*b;
        System.out.println(j.m2(10,5));
    }
    
}

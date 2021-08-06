/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L09_LambdaVsAnonymous;
import java.util.*;
/**
 *
 * @author DELL-2 PC
 */
interface A{
    public void m1();
    public void m2();
}
public class Test {
    public static void main(String args[])
    {
        A a =new A()
        {
          public void m1()
          {
              System.out.println("m1 from A");
          }
          public void m2()
          {
              System.out.println("m2 from A");
          }
        };
        a.m2();
    //    A b=()->{};   A is not functional interface so we can't make lambda expression
    }
}

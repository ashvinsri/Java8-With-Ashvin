/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L07_AnonymousInnerClass;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

class Inner{
    public void m1()
    {
        System.out.println("I am inner class m1");
    }
    public void m2()
    {
        System.out.println("I am inner class m2");
    }
}
public class Test {
    public static void main(String args[])
    {
        Inner i1=new Inner()
        {
          public void m1()
          {
              System.out.println("I am main method m1");
          }
          public void m2()
          {
              super.m2();
              System.out.println("I am main method m2");
          }
          public void m3()
          {
              System.out.println("I am main method m3");
          }
        };
        i1.m1();
        i1.m2();
        Inner i2=new Inner();
        i2.m1();
        
 }
    
}

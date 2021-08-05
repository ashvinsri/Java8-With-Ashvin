/**
 *  We are given n employees along with employee id,employee name, salary now we have to sort the on the basis of their salary.
 * 
 */
package L06_LambdaExpression;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id,String n,double s)
    {
        this.id=id;
        this.name=n;
        this.salary=s;
    }
    public String toString()
    {
        return this.name+ " "+this.id;
    }
}


public class Test {
    public static void main(String args[])
    {
        ArrayList<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee(1,"Ashvin",76000));
        emp.add(new Employee(2,"Supreet",300000));
        emp.add(new Employee(3,"Harshit",16000));
        emp.add(new Employee(4,"Golu",14000));
        Comparator<Employee> c=(Employee e1,Employee e2)->(e1.salary>e2.salary)?1:(e2.salary>e1.salary)?-1:0;   //First method of doing so is this
        Collections.sort(emp,(e1,e2)->(e1.salary>e2.salary)?-1:(e2.salary>e1.salary)?1:0);  //We can make it more simple by just adding it here directly
        System.out.println(emp);
        
    }
}

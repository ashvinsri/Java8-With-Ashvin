/**
 *  Function is also a functional interface contains only single method apply().....Actually it takes two arguments in the angular bracket first one is type of argument(T) and second one is 
 *  Type of result(R) 
 *  interface Function<T,R>
 * {
 *      default R apply(T)
 * {
 * 
 * }
 */
package LA06_FunctionsInJava8;
import java.util.function.*;
/**
 *
 * @author DELL-PC
 */
class Student{
    int roll;
    String name;
    int marks;
    
    Student(int r,String n,int m)
    {
        this.roll=r;
        this.name=n;
        this.marks=m;
    }    
}

public class Test {
    public static void main(String args[])
    {
        Function<Integer,Integer> f1=i->i*i;
        System.out.println("Square Of given number is "+f1.apply(4));
        
        Function<String,Integer> f2=s->s.length();
        System.out.println("Length Of given String is "+f2.apply("Ashvin"));
        
        Function<String,String> f3=s->s.toUpperCase();
        System.out.println("Upper Case Of String is "+f3.apply("Ashvin"));
        
        //////    Calculate Grade Usng Marks ////////////
        Student st[]={new Student(1,"Ashvin",78),new Student(2,"Supreet",98),new Student(3,"Visu",48),new Student(4,"Vasu",35),new Student(5,"Yashu",55),new Student(4,"Tasu",65)};
        Function<Student,String> f4=s->(s.marks<=100 && s.marks>80)?"A":(s.marks<80 && s.marks>=70)?"B":(s.marks<70 && s.marks>=50)?"C":"Failed";
        for(Student s:st)
        {
            System.out.println(f4.apply(s));
        }
        
        //////Now suppose I want to display the name,marks and grade of only those student whose marks are greater than 60 so this is a type of conditional check we must use Predicate//////   
        
        Predicate<Student> p1=f->f.marks>60;
        for(Student s:st)
        {
            if(p1.test(s))
            {
                System.out.println(s.roll);
                System.out.println(s.name);
                System.out.println(s.marks);
                System.out.println(f4.apply(s));
                
            }
        }
        
    }
}



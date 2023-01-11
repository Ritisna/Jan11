package Jan7;
import java.util.*;
public class StudentList {
    public static void main (String [] args){
        ArrayList<Student> students = new ArrayList<Student> ();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter name and regdNo");
        for(int i=0; i<5;i++){
            System.out.println("Enter Name");
            String s=sc.nextLine();
            System.out.println("Enter RegdNo");
            int a=sc.nextInt();
            sc.nextLine();
            students.add(new Student(a, s));
        }
        for (Student s:students)
        System.out.println(s);
        sc.close();

    }
}

package ClassAndObject;
import java.util.Scanner;
public class Student {
    private String name;
    private int id;
    private double cgpa;

    public static void main(String[] args){
        Student s1=new Student();

        s1.name="Sabbir Khan";
        s1.id=845;
        s1.cgpa=3.577;

        Student s2=new Student();

        s2.name="ZIhad Khan";
        s2.id=365;
        s2.cgpa=3.99;

        System.out.println("Name of student : "+s1.name+" Id of Student: "+s1.id+"Cgpa :"+s1.cgpa);
        System.out.println("Name of student : "+s2.name+" Id of Student: "+s2.id+" Cgpa :"+s2.cgpa);
    }

}

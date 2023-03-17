package ClassAndObject;
import java.util.Scanner;
public class Person {
    String name;
    int age;


    public static void main(String[] args){
        Person shakil=new Person();
        shakil.name="Md Shakil Khan";
        shakil.age=24;

        Person salman=new Person();
        salman.name="Salman Farshe Zihad";
        salman.age=21;

        System.out.println("Name="+shakil.name+" Age="+shakil.age);
        System.out.println("Name="+salman.name+" Age="+salman.age);
//        take user input

        Person customUser=new Person();

        Scanner input =new Scanner(System.in);
        customUser.name=input.nextLine();
        customUser.age=input.nextInt();

        System.out.println("Custom USer name="+customUser.name+" age ="+customUser.age);

    }
}

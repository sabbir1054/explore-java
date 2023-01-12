import java.util.Scanner;

public class BasicVar {
    public static void main(String[] args){
        boolean isShort=true;
        char myName='s';
        int myAge=34;
        String nameM="sabbir";
        float height = 45.33f;

        System.out.print("Please input your name: ");
        Scanner input=new Scanner(System.in);
//        String myName2=input.next(); take input till space
        String myName2=input.nextLine();//take space input
        int myAge2=input.nextInt();

        System.out.printf("My name is %s and my age is %d",myName2,myAge2);
    }
}

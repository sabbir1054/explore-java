package ClassAndObject;

import java.util.Scanner;

public class Box {
    int height;
    int width;


    public static void main(String[] args){
//        create object
        Box customBox1=new Box();
//        insert data in the above object
//        customBox1.height=10;
//        customBox1.width=20;
//        make a object from scanner class
Scanner input=new Scanner(System.in);
//make a input variable for store input
        System.out.println("Please input height and width ");
        customBox1.height=input.nextInt();
        customBox1.width=input.nextInt();
        System.out.println("Height="+customBox1.height+" Width="+customBox1.width);

        if (customBox1.height> customBox1.width){
            System.out.print("Tall Rectanguler");
        } else if (customBox1.height< customBox1.width){
            System.out.println("Fat Rectangular");
        }else{
            System.out.print("Square");
        }
    }

}

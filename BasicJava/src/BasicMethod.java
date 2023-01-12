import java.util.Scanner;

public class BasicMethod {
    static void MyFirstMethod(){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        System.out.println("Sum= "+(num1+num2));
    }

    static int MySecondMethod(int x){

        return x*10;
    }
    public static void main(String[] args){
        MyFirstMethod();
        int result = MySecondMethod(845);

        System.out.println(result);
    }
}

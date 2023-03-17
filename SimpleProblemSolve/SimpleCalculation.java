import java.util.Scanner;

public class SimpleCalculation {

   static float addNumbers(float x, float y){
       return x+y;
   }

   static float subNumbers(float x, float y){
       if(x>y){
           return x-y;
       }else {
           return x-y;
       }
   }

   static float multNumbers(float x, float y){
       return x*y;
   }

   static float devide(float x, float y){
       if(x>y){
           return x/y;
       }else {
           return y/x;
       }
   }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Input value 1 and value 2 : ");
        float value1=input.nextFloat();
        float value2=input.nextFloat();


        System.out.print("\n\n\t\t1. Add numbers \n\t\t2. Subtract Numbers \n\t\t3. Multiply Numbers \n\t\t4. Divided numbers \n\tEnter your choice:");
        int choice= input.nextInt();
        float result = 0;

        switch (choice){

            case 1:
                result=addNumbers(value1,value2);
                break;
            case 2:
                result=subNumbers(value1,value2);
                break;
            case 3:
                result = multNumbers(value1, value2);
                break;
            case 4:
                result= devide(value1,value2);
            default:
                break;


        }
        System.out.println(result);

    }

}

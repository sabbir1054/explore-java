import java.util.Scanner;

public class BasicArrPlay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] ages=new int[20];

        for (int i=0;i<5;i++){
            System.out.printf("Input ages %d =",i);
            ages[i]=input.nextInt();
        }

        for (int i=0; i<ages.length;i++){
            System.out.println(ages[i]);
        }
    }
}

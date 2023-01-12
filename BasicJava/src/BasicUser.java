import java.util.Scanner;

public class BasicUser{
    public static void main(String[] args) {
        int myMarks;
        String SubjectName;

        System.out.print("Please input your subjects name and age :");
        Scanner input = new Scanner(System.in);
        SubjectName = input.nextLine();
        myMarks = input.nextInt();

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.printf("Subject name =%s  and Marks=%d \n", SubjectName, myMarks);
            } else if (i % 5 == 0) {
                System.out.println(5);
            } else {
                System.out.println("You can make anything");
            }
        }
    }
}
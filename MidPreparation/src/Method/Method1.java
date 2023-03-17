package Method;

public class Method1 {
    public static void main(String[] args){
        int a=10,b=5;
        sum(a,b);
        System.out.print("\n Max = "+max(a,b));
    }
    public static void sum (int a, int b){
        System.out.print("The sum is: "+(a+b));
    }

    public static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}

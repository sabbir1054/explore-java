package ClassAndObject;

public class Depertmant {
    private String deptName;
    private int deptCode;
    private String faculty;

    public static void main(String[] args){
        Depertmant d1=new Depertmant();
        d1.deptName="Software Engineering ";
        d1.deptCode=35;
        d1.faculty="ISHRAQ";

        System.out.print("Dept: "+d1.deptName+"Dept code:"+d1.deptCode+" Faculty"+" Eshraq");
    }
}

public class StudentProfile {
    String id;
    String name;
    double cgpa;


    public void insert_student(String id,String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    public void display_user(){
        System.out.printf("Name: %s  | Id: %s  | Cgpa: %f",name,id,cgpa);
//        System.out.println("Name: "+name);
    }


    public static void main(String[] args){
//        make student object
        StudentProfile profile1=new StudentProfile();
        StudentProfile profile2=new StudentProfile();
//        insert student data
        profile1.insert_student("221-35-845","Sabbir Hossain",3.76);
        profile2.insert_student("221-35-975","Ebrahim Rahman",3.78);
//        display student data
        profile1.display_user();
        System.out.println(" ");
        profile2.display_user();
    }
}

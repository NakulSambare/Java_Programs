public class Student {
    String sname;
    public Student(String sname){
        this.sname=sname;
        System.out.println("Creating student");
    }

    public void showStudent(){
        System.out.println(sname);
    }

}

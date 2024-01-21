import java.util.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hellow world");
        System.out.println("Todays date is : "+new Date());
        System.out.println(" date is "+new Date().getTime());
        System.out.println("Changes Completed");

        Student s = new Student("Nakul");
        s.showStudent();
    }
}
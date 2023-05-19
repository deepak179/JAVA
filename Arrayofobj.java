class Student
{
    int roll_no;     
    String name;
    int marks;
}


public class Arrayofobj {
    public static void main(String[] args) {
       Student s1;               // object reference declaration
       s1 = new Student();        // object initantiate
       s1.name = "Deepak";
       s1.roll_no = 1;
       s1.marks = 20;
       
       Student s2 = new Student();
       s2.roll_no = 2;
       s2.name = "Shaswat";
       s2.marks = 21;

       Student s3 = new Student();
       s3.roll_no = 3;
       s3.name = "Anchit";
       s3.marks = 19;

       Student s4 = new Student();
       s4.roll_no = 4;
       s4.name = "Ankit";
       s4.marks = 21;

       Student students[];               // object array decalration
       students = new Student[4];         // instantiation
       students[0] = s1;
       // students[0].name = "Deepak";           we can't do this as array of objects stores the reference of objects not the actual object
       students[1] = s2;
       students[2] = s3;
       students[3] = s4;

       for(int i = 0; i < students.length; i++)
       {
        System.out.println(students[i].name + " : " + students[i].marks);
       }
    
    }
}

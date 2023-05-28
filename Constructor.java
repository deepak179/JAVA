// Constructor will be called as soon as the object is created.
// If we don't create a constructor, then still java will take care of the constructor and will assign the default values to the parameters.
// If we want to make any changes to the default constructor then we have to explicitly change it.
// The parameterized constructor will take arguments from the user and assign thse values to the object's instance variables.

class Student
{
    int roll_no;
    String name;
    int age;
    
    public Student()                        // Default constructor
    {
        roll_no = 01;
        name = "Student";
        age = 21;
    }

    public Student(int roll_no, String name, int age)           // Parameterized constructor
    {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Anchit", 23);        // Parameterized constructor will be called as we are passing the arguments to it
        System.out.println(s1.name + ": " + s1.age);
        Student s2 = new Student(2, "Aryan", 22);
        System.out.println(s2.name + ": " + s2.age);
        Student s3 = new Student(3, "Ajay", 22);
        System.out.println(s3.name + ": " + s3.age);
        Student s4 = new Student(4, "Deepak", 23);
        System.out.println(s4.name + ": " + s4.age);
        Student s5 = new Student(5, "Vishal", 24);
        System.out.println(s5.name + ": " + s5.age);
        Student s6 = new Student(6, "Parminder", 22);
        System.out.println(s6.name + ": " + s6.age);
        Student s7 = new Student(7, "Yashav", 24);
        System.out.println(s7.name + ": " + s7.age);
        Student s8 = new Student(8, "Harpreet", 24);
        System.out.println(s8.name + ": " + s8.age);
        Student s9 = new Student();                       // Default constructor will be called
        System.out.println(s9.name + ": " + s9.age);
    }
}

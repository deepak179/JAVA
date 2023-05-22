class Human
{
    private int age;                    // age is only accessible in the same class. No object from outside the class can use it.
    private String name;                // These variables can be accessed but not directly. The variables can be accessed by the methods of the class
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // public Human(String n, int a)
    // {
    //     name = n;
    //     age = a;
    // }
    
}

public class Encapsulation {
    public static void main(String[] args) {
        // Human obj = new Human("Deepak", 23);
        Human obj = new Human();
        obj.setName("Deepak");
        obj.setAge(23);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

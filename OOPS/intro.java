import java.util.*;
public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[1];
        int n = students.length;

        //Object creation for default constructor
        Student stu = new Student();
        //Two reference var(objects) pointing to same object
        Student stu1 = stu;

        //Object creation for single para constructor (Constructor Chaining)
        Student stu2 = new Student(100);
        System.out.println(stu1.name);

        for(int i = 0;i < n; ++i){
            System.out.println("Enter roll: ");
            int rollNo = sc.nextInt();

            System.out.println("Enter name: ");
            String name = sc.next();

            System.out.println("Enter marks: ");
            float marks = sc.nextFloat();

            //object creation for parameterized constructor
            students[i] = new Student(rollNo, name, marks);
        }
        for (int i = 0; i < n; ++i) {
            try{
                students[i].display();
            } catch(NullPointerException e){
                System.out.println("{0,null,0.0}");
            }
        }
        //stu.name = "Ram Jha";
        stu.display();

        final A obj1 = new A();
        obj1.name = "Tushar Jha";
        System.out.println(obj1.name);


        //final keyword reassignment is not possible for non-primitive data types
        //obj1 = new A("Ram Jha");


        // final keyword reassignment/modification is not possible for primitive data types
        //Can't be handled as final errors are compile time errors(runtime can be handled)
        
        // try{
        //     obj1.x = 20;
        // } catch(Exception e){
        //     System.out.println("Final keyword reassignment/modification is not possible for primitive data types");
        // }
        

    }
}
class A{
    final int x = 10;
    String name;
    A(){
        this.name = "Arjun Jha";
    }
}

class Student{
    int rollNo;
    String name = "Arjun Jha";
    float marks;

    //Function Overloading

    Student(){
        this.rollNo = 150;
        //this.name = "Tushar Jha";
        this.marks = 100;
    }

    Student(int roll){
        this(101,"Contructor calling contructor",86.5f);
    }

    Student(int roll,String name,float marks){
        this.rollNo = roll;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("{"+rollNo+","+name+","+marks+"}");
    }


    //whenever an object of class A is destroyed, this function is called by garbage collector
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
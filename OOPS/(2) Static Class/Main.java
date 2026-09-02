public class Main {
    public static void main(String[] args) {
        Human Tushar = new Human(20,"Tushar Jha",10000000,false);
        Human Mayank = new Human(21, "Mayank Jha", 8000000, false);
        
        //Using ref variable to access static method is fine, but the correct convention is to use class instead.

        // System.out.println(Tushar.population);
        // System.out.println(Mayank.population);

        System.out.println(Human.population);
        System.out.println(Human.population);

        Human Arpit = new Human(35, "Arpit Mishra", 5000000, true);
        System.out.println(Human.population);

        //But to access class properties ref are used 
        System.out.println(Tushar.salary);

        // fun();
        Main obj1 = new Main();
        // obj1.greeting();
        obj1.nonStatic();
        
        //accessing static func from Human class
        Human.message();
    }

    //Non-static member can't be accessed by a static member unless non-static has an object or they make them static
    //Non-static function
     void greeting(){

        //non-static can access static function
        System.out.println("Hello World!!");
        // fun();
    }

    //Static function
    static void fun(){
        //an object is created for the non-static func
        //It is defined under Main class hence,
        Main obj = new Main();

        //non-static member accessed by static after object creation
        obj.greeting();

        System.out.println("Have a fun day");
    }

    //non-static can access non-static
    //Here in main if i create an object for non-static (nonStatic) it will autoused for the non-static func inside it (greeting)
    void nonStatic(){
        greeting();
    }

}

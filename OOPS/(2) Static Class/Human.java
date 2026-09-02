public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        //since population is static, we don't need to use "this" keyword.
        //instead we can just use class name "Human".

        // Using class name and this keyword, both are correct
        //this.population +=1;

        Human.population += 1;
    }

    static void message(){
        System.out.println("!!!Hello!!!");
    }
}
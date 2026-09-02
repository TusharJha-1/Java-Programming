public class Main {
    public static void main(String[] args) {
        //Instance created
        Singleton obj1 = Singleton.getInstance();

        //Existing obj returned
        Singleton obj2 = Singleton.getInstance();

        obj2.name = "Ram";
        System.out.println(obj1.name);
        System.out.println(obj1==obj2);

    }
}

public class Singleton {
    String name;
    private Singleton(){
        this.name = name;
    }
    
    private static Singleton obj;

    public static Singleton getInstance(){
        if(obj==null){
            obj = new Singleton();
        }
        return obj;
    }
}

public class staticBlock {
    static int a = 4;
    static int b;

    static{
        System.out.println("We are in the static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        //This statement will call the static block inside "staticBlock"  and create an object as well (although it doesn't need it) 
        staticBlock obj = new staticBlock();
        System.out.println("a = "+staticBlock.a+"\nb = "+staticBlock.b);
        
        staticBlock.b += 3;
        System.out.println("a = " + staticBlock.a + "\nb = " + staticBlock.b);

        //The static block only executes once to initialize everything
        //Since, the staticBlock is already loaded it won't load again(it just creates the unnecessary object this time)
        staticBlock obj2 = new staticBlock();
        System.out.println("a = " + staticBlock.a + "\nb = " + staticBlock.b);
    }
}

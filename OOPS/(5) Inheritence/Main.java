public class Main {
    public static void main(String[] args) {
        Box box = new Box(1,3,2);
        Box box2 = new Box(box);
        System.out.println("Length : "+box2.l+"\nWidth : "+box2.w+"\nHeight : "+box2.h+"\n");

        Box_Weight bx1 = new Box_Weight();
        Box_Weight bx2 = new Box_Weight(4,3,2,1);
        System.out.println("Length : " + bx1.l + "\nWidth : " + bx1.w + "\nHeight : " + bx1.h + "\nWeight : "+bx1.weight+"\n");
        System.out.println("Length : " + bx2.l + "\nWidth : " + bx2.w + "\nHeight : " + bx2.h + "\nWeight : "+bx2.weight+"\n");
    
        //creating object of child class with reference var of parent class
        //This can't access the child class properties and scope depends on reference
        
        //The code line(16 - 19) in Box_Weight.java is exactly implementing this
        Box box5 = new Box_Weight(1, 2, 3, 4);
        Box_Weight bx5 = new Box_Weight(bx2);
        System.out.println("lllll "+bx5.weight);

        //Not possible to access child properties
        //System.out.println(box5.weight);

        //Possible 
        System.out.println(box5.l +" "+ box5.w + " " + box5.h);
    
        //Now creating object of parent class referencing to child class
        //Not possible becouse child class wants to initialize the weight but parent has no idea of that 
        // Box_Weight bx6 = new Box(2,3,4);
        //Hence, we can't do this


        
    
    }
    
}

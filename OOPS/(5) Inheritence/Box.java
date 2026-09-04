public class Box{
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //Cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    //Cuboid
    Box(double l, double w,  double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void display(){
        System.out.println("We have a box!!");
    }
}
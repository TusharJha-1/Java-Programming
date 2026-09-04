//Extending class Box (Inheriting Box class)
public class Box_Weight extends Box{
    double weight;

    public Box_Weight(){
        this.weight = 0;
    }

    public Box_Weight(double length, double width, double height, double weight){
        //super is used to call public contents of parent class
        //Here super is used to call the Box class constructor with 3 args
        this.weight = weight;
        super(length, width, height);
    }

    public Box_Weight(Box_Weight other){
        super(other);
        weight = other.weight;
    }
}

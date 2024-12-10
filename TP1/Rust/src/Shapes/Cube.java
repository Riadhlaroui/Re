package Shapes;

public class Cube extends Square{

    public Cube(double s){
        super(s);
    }

    @Override
    double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
    
   
    
}

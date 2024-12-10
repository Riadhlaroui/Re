package Shapes;


public class Square extends FormGeo{

    public Square(double s){
        this.side = s;
    }
    
    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter(){
        return 4 * side;

    }

    @Override
    double surfaceArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'surfaceArea'");
    }

    @Override
    double volume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volume'");
    }

    @Override
    void draw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }


}

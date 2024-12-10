package Shapes;

public class Rectangle extends FormGeo {


    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    double area() {
       return length * width;
    }

    @Override
    double perimeter() {
        return 2* (length + width);
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

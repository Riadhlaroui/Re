package Shapes;

abstract class FormGeo {
    double side;
    double length, width;
    double radius;

    int formx, formy;


    void draw(){
    }

    abstract double area();
    abstract double perimeter();

    abstract double surfaceArea();
    abstract double volume();

}

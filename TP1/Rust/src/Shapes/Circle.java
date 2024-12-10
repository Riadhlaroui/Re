package Shapes;

interface Circledraw {
    void drawWithInterface();
    int x = 0;
    int y = 0;
    
}

public class Circle extends FormGeo implements Circledraw{

    public Circle(double r, int cordX, int cordY) {
        this.radius = r;
        this.formx = cordX;
        this.formy = cordY;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
       
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

    // @Override
    // void draw() {
    //     System.out.println("Cords x : " + x + "Cord y: " + y);
    //     System.out.println("Radius: "+ radius);
    // }

    @Override
    public void drawWithInterface() {
        System.out.println("Interface:");
        System.out.println("Cords x : " + x + " Cord y: " + y);
        System.out.println("Radius: " + radius);
    }

    @Override
    void draw() {
        System.out.println("Abstract:");
        System.out.println("Cords x : " + formx + "Cord y: " + formy);
        System.out.println("Radius: "+ radius);
    }
    
}

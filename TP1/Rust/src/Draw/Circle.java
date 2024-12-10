package Draw;

public class Circle extends FormGeo{

    public Circle(double r, int cordX, int cordY) {
        this.radius = r;
        this.x = cordX;
        this.y = cordY;
    }
    
    void draw() {
        System.out.println("Abstract:");
        System.out.println("Cords x : " + x + "Cord y: " + y);
        System.out.println("Radius: "+ radius);
    }
}

package Shapes;

public class Main {

    public static void main(String[] args) {
        // Rectangle rectangle = new Rectangle(5, 5);
        // System.out.println("rectangle surface:"+rectangle.area());//l*w
        // System.out.println("rectangle perimeter:"+rectangle.perimeter());//2 (l+w)

        Circle circle = new Circle(5, 10, 5);
        System.out.println("circle surface: " +circle.area());//pi*r^2
        System.out.println("circleperimeter " +circle.perimeter());//2*pi*r
        circle.draw();
        System.out.println("Interface draw:");
        circle.drawWithInterface();

        // Cube cube = new Cube(4);
        // System.out.println("cube surface: " +cube.surfaceArea());//6*s*s
        // System.out.println("cube surface: " +cube.volume());//s^3

        

    }
}

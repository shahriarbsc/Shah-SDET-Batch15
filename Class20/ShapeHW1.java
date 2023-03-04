package Class20;

public class ShapeHW1 {

    double radius;
    ShapeHW1(double radius){
        this.radius=radius;
    }
}

class Circle extends ShapeHW1{

    double pi;

    Circle(double radius, double pi){
        super(radius);
        this.pi=pi;

    }
    void area(){
        System.out.println("The area of circle is "+(radius*pi*pi));
    }
}



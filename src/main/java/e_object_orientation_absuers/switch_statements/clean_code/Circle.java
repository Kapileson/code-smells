package e_object_orientation_absuers.switch_statements.clean_code;

public class Circle implements Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

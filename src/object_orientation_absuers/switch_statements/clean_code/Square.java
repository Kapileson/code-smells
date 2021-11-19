package object_orientation_absuers.switch_statements.clean_code;

public class Square implements Shape{

    double length;

    Square(double length){
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}

package e_object_orientation_absuers.switch_statements.bad_code;

enum ShapeType{ SQUARE, RECTANGLE, CIRCLE }

public class Shape {

    double length;
    double breadth;
    double radius;

    public double calculateArea(ShapeType shape){
        switch(shape){
            case SQUARE:
                return length * length;
            case RECTANGLE:
                return length * breadth;
            case CIRCLE:
                return Math.PI * radius * radius;
            default:
                return 0;
        }
    }

    public double calculatePerimeter(ShapeType shape){
        switch(shape){
            case SQUARE:
                return 4 * length;
            case RECTANGLE:
                return 2 * (length + breadth);
            case CIRCLE:
                return 2 * Math.PI * radius;
            default:
                return 0;
        }
    }
}

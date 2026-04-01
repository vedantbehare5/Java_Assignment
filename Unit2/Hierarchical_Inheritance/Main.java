class ShapeBase {
    void display() {
        System.out.println("Shape Info");
    }
}

class Circle2 extends ShapeBase {
    void area() {
        System.out.println("Circle Area: " + (3.14 * 5 * 5));
    }
}

class Rectangle2 extends ShapeBase {
    void area() {
        System.out.println("Rectangle Area: " + (4 * 6));
    }
}

public class Main {
    public static void main(String[] args) {

        // Circle object
        Circle2 c = new Circle2();
        c.display();
        c.area();

        System.out.println();

        // Rectangle object
        Rectangle2 r = new Rectangle2();
        r.display();
        r.area();
    }
}
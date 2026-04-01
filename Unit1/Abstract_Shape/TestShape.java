abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void calculate_area() {
        double area = Math.PI * 5 * 5;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle1 extends Shape {
    void calculate_area() {
        System.out.println("Rectangle Area: " + (4 * 6));
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.display_info();
        s.calculate_area();

        s = new Rectangle1();
        s.calculate_area();
    }
}
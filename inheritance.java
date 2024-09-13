// Parent class (Shape)
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class (Circle) that extends the parent class (Shape)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child class (Rectangle) that extends the parent class (Shape)
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Create objects of the child classes
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Use polymorphism to call the draw method on these objects
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        shape1.draw();  // Output: Drawing a circle
        shape2.draw();  // Output: Drawing a rectangle
    }
}

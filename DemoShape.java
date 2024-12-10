// Define the Shape interface
interface Shape {
    void draw();
    void erase();
}

// Implement the Circle class
class Circle implements Shape {
    public void draw() {
        System.out.println("Circle.draw() ...");
    }

    public void erase() {
        System.out.println("Circle.erase() ...");
    }
}

// Implement the Triangle class
class Triangle implements Shape {
    public void draw() {
        System.out.println("Triangle.draw() ...");
    }

    public void erase() {
        System.out.println("Triangle.erase() ...");
    }
}

// Implement the Square class
class Square implements Shape {
    public void draw() {
        System.out.println("Square.draw() ...");
    }

    public void erase() {
        System.out.println("Square.erase() ...");
    }
}

// Main class for demonstration
public class DemoShape {
    public static void main(String[] args) {
        Shape shape;

        // Assigning a Circle object to the Shape reference and calling methods
        shape = new Circle();
        shape.draw();
        shape.erase();

        // Assigning a Triangle object to the Shape reference and calling methods
        shape = new Triangle();
        shape.draw();
        shape.erase();

        // Assigning a Square object to the Shape reference and calling methods
        shape = new Square();
        shape.draw();
        shape.erase();
    }
}

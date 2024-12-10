import java.util.Scanner;

abstract class Shape {
    public abstract float calculatePerimeter();
    public abstract float calculateArea();
    
}

 class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * radius * radius );
    }
    
}


 class Triangle extends Shape {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public float calculatePerimeter() {
        return (float) (a + b + c);
    }

    @Override
    public float calculateArea() {
    float s = (float)((a+b+c) / 2.0);
    float area = (float)Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }
}


public class ShapeDemo {
    public static void main(String[] args)
    {
        int option = 0;
        int radius;
        int a;
        int b;
        int c;
        
        float perimeter;
        float area;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("Enter your option : ");
        option = scanner.nextInt();
        
        Shape shape;
        
        switch (option)
        {
            case 1 :
                System.out.println("Enter radius : ");
                radius = scanner.nextInt();
                shape = new Circle(radius);
                perimeter = shape.calculatePerimeter();
                area = shape.calculateArea();
                System.out.println("Perimeter : " + perimeter);
                System.out.println("Area : " + area);
                break;
                
            case 2 :
                System.out.println("Enter 3 sides of triang;e  : ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                shape = new Triangle(a,b,c);
                perimeter = shape.calculatePerimeter();
                area = shape.calculateArea();
                System.out.println("Perimeter : " + perimeter);
                System.out.println("Area : " + area);
                break;
                
        }
    }
    
}

    


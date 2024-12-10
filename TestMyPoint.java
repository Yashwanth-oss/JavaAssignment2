class MyPoint {
    // Instance variables
    private int x;
    private int y;

    // Default constructor (no-arg)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor with given x and y coordinates
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get both x and y in a 2-element array
    public int[] getXY() {
        return new int[] { this.x, this.y };
    }

    // toString() method to return a string description of the point
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    // Method to calculate distance to another point given its x and y coordinates
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}

public class TestMyPoint {
    public static void main(String[] args) {
        // Test default constructor and toString method
        MyPoint p1 = new MyPoint();
        System.out.println("p1: " + p1); 

        // Test overloaded constructor
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("p2: " + p2); 

        // Test setXY and getXY methods
        p1.setXY(5, 6);
        int[] coords = p1.getXY();
        System.out.println("p1 new coordinates: (" + coords[0] + ", " + coords[1] + ")"); // Should print (5, 6)

        // Test distance to another point (with given x and y)
        System.out.println("Distance from p1 to (7, 8): " + p1.distance(7, 8)); // Should print distance

        // Test distance to another MyPoint instance
        System.out.println("Distance from p1 to p2: " + p1.distance(p2)); // Should print distance

        // Test distance to origin (0, 0)
        System.out.println("Distance from p1 to origin: " + p1.distance()); // Should print distance
    }
}



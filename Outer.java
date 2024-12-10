class OuterClass {
    
    // Method in the outer class
    public void display() {
        System.out.println("Display method of OuterClass");
    // Create an instance of the inner class
        InnerClass inner = new InnerClass();
    // Call the display method of the inner class
        inner.display();
    }
    
    // Inner class definition
    class InnerClass {
        
        // Method in the inner class
        public void display() {
            System.out.println("Display method of InnerClass");
        }
    }
}


public class Outer {
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outer = new OuterClass();
        
        // Call the display method of the outer class
        outer.display();

    }
    
}

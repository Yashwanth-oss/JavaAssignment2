import java.util.Scanner;

 class Rectangle implements Resizable 
 {

    private int height;
    private int width;

    public Rectangle()
    {
        
    }
    public Rectangle(int height, int width) 
    {
        this.height = height;
        this.width = width;
    }
    
    @Override
    public void resizeHeight(int height) 
    {
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) 
    {
        this.width = width;
    }
    
    public String toString()
    { 
        return "Height : " + this.height + "  Width : " + this.width;
    }
}

 interface Resizable {
    public void resizeHeight(int height);
    public void resizeWidth(int width);
    
}

public class RectangleDemo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int height = 0;
        int width = 0;
        
        System.out.println("Enter the height and width of rectangle");
        height = scanner.nextInt();
        width = scanner.nextInt();
        
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println(rectangle);
        
        System.out.println("Enter the new height and width");
        int newHeight = scanner.nextInt();
        int newWidth = scanner.nextInt();
        
        Resizable resizable = new Rectangle();
        resizable.resizeHeight(newHeight);
        resizable.resizeWidth(newWidth);
        
        System.out.println(resizable);
       
        }
    
}

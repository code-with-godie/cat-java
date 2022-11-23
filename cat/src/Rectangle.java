import java.util.Scanner;

public class Rectangle {
    float length;
    float width;
    String label;

    public Rectangle(float length, float width, String label) {
        this.length = length;
        this.width = width;
        this.label = label;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static Rectangle createRectangle(Scanner scanner){
        System.out.println("enter you rectangle label");
        String label = scanner.next();
        System.out.println("enter you rectangle length");
        float length = scanner.nextFloat();
        System.out.println("enter you rectangle width");
        float width = scanner.nextFloat();
        return new Rectangle(length,width,label);
    }

    public double getArea(){
        return this.length * this.width;
    }
    public double getVolume(){
        return this.length * this.width;
    }
}

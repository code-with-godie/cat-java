import java.util.Scanner;

public class Triangle {
    float height;
    float base;
    String label;

    public Triangle(float height, float base, String label) {
        this.height = height;
        this.base = base;
        this.label = label;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static Triangle createTriangle(Scanner scanner){
        System.out.println("enter you triangle base ");
        String label = scanner.next();
        System.out.println("enter you triangle base ");
        float base = scanner.nextFloat();
        System.out.println("enter you triangle height");
        float height = scanner.nextFloat();
        return  new Triangle(height,base,label);
    }

    public double getArea(){
        return 0.5 * this.base * this.height;
    }
    public double getVolume(){
        return this.base * this.height;
    }
}

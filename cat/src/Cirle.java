import java.util.Scanner;

public class Cirle  {
    float radius;
    String label;

    public Cirle(float radius,String label) {
        this.radius = radius;
        this.label = label;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    public String getLabel() {
        return label;
    }

    public static Cirle createCircle(Scanner scanner){
        System.out.println("enter the shape label ");
        String label = scanner.next();
        System.out.println("enter you radius ");
        float radius = scanner.nextFloat();
        return new Cirle(radius,label);
    }
    public void printCIrcle (){
        System.out.println("{" + "radius -> " + this.radius  + "\n");
    }

    public static double getArea(double radius){
        return  22/7 * radius * radius;
    }


    public double getArea() {
        return  22/7 * radius * radius;
    }


    public double getVolume() {
        return 0;
    }

}

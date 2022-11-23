import java.util.ArrayList;
import java.util.Scanner;

public class Square  {
    float sideDimensions;
    String label;
    public static ArrayList squares = new ArrayList<Square>();

    public Square(float sideDimensions, String label) {
        this.sideDimensions = sideDimensions;
        this.label = label;
    }

    public float getSideDimensions() {
        return sideDimensions;
    }

    public void setSideDimensions(float sideDimensions) {
        this.sideDimensions = sideDimensions;
    }

    public String getLabel() {
        return label;
    }



    public void setLabel(String label) {
        this.label = label;
    }

    public static Square createSquare(Scanner scanner){
        System.out.println("enter you square label");
        String label = scanner.next();
        System.out.println("enter you square dimension");
        float side = scanner.nextFloat();
        return new Square(side,label);
    }

    public double getArea(){
        return this.sideDimensions * this.sideDimensions;
    }
    public static double getVolume(Double side){
        return side * side;
    }
}

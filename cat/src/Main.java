import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static ArrayList myShapes;
   private static ArrayList circles ;
   private static ArrayList squares;
    private static ArrayList rectangles ;
    private static ArrayList triangles;
    public static void main(String[] args) {
        myShapes = new ArrayList<>();
        circles = new ArrayList<Cirle>();
        squares = new ArrayList<Square>();
        rectangles = new ArrayList<Rectangle>();
        triangles = new ArrayList<Triangle>();
        scanner = new Scanner(System.in);
        printInstractions();
        int command = 0;
        while(command != 8){
            System.out.println("Enter your command: ");
            command = scanner.nextInt();
            switch (command){
                case 0 :
                    printInstractions();
                    break;
                case 1 :
                    createShape();
                    break;
                case 2 :
                    deleteShape();
                    break;
                case 3 :
                    printShapes();
                    break;
                case 4 :
                    editShape();
                    break;
                case 5 :
                    searchShapes();
                    break;
                case 6 :
                    getArea();
                    break;
                case 7 :
                     getVolume();
                    break;
                default:
                    break;

            }
        }
    }
    public static void printInstractions(){
        System.out.println("\tpress 0 -> to print the instractions \n" +
                            " \tpress 1-> to create a new shape \n" +
                            " \tpress 2 -> to delete a  shape \n" +
                            " \tpress 3 -> to show all the shapes a delete shape \n" +
                            " \tpress 4 -> to edit a  shape \n" +
                            " \tpress 5 -> to search a shape by name \n" +
                            " \tpress 6 -> to get area of a shape \n" +
                            " \tpress 7 -> to get volume of a shape \n" +
                            "\tpress 8 -> to exit the program \n"
        );
    }
    public static void createShape(){
        System.out.println(
                " \tpress 1-> to create a square \n" +
                " \tpress 2 -> to create a  rectangle \n" +
                " \tpress 3 -> to create a triangle \n" +
                " \tpress 4 -> to create a cirle \n"
        );
        int command = scanner.nextInt();
        if(command == 1){
            Square newSquare = Square.createSquare(scanner);
            myShapes.add(newSquare);
            System.out.println("your square successfully created");
        }
        if(command == 2){
            Rectangle newRec = Rectangle.createRectangle(scanner);
            myShapes.add(newRec);
            System.out.println("your rectangle successfully created");
        }
        if(command == 3){
            Triangle newTringle = Triangle.createTriangle(scanner);
            myShapes.add(newTringle);
            System.out.println("your triangle successfully created");
        }
        if(command == 4){
            Cirle newCircle = Cirle.createCircle(scanner);
            myShapes.add(newCircle);
            System.out.println("your circle successfully created");
        }
    }
    public static void deleteShape(){
        System.out.println("am deleting  a shape");
    }
    public static boolean printShapes(){
        groupShapes();
        if(circles.size() > 0){
            System.out.println("all the circles present: \n");
            for (Object cirle:circles) {
            }
        }
        if(rectangles.size() > 0){
            System.out.println("all the rectangles present: \n");
            for (Object rec:rectangles) {
                System.out.println( "\t" + rectangles.indexOf(rec) + 1 + "->" + rec);
            }
        }
        if(triangles.size() > 0){
            System.out.println("all the triangle present: \n");
            for (Object triangle:triangles) {
                System.out.println( "\t" + triangles.indexOf(triangle) + 1 + "->" + triangle);
            }
        }
        if(squares.size() > 0){
            System.out.println("all the squares present: \n");
            for (Object square:squares) {
                System.out.println( "\t" + squares.indexOf(square) + 1 + "->" + square);
            }
        }

        return  true;
    }
    public static void editShape(){
        if(printShapes()){
            System.out.println("enter the index of the shape you want to edit");
            int index = scanner.nextInt();
            if( myShapes.contains(myShapes.get(index -1))){
                System.out.println(myShapes.get(index -1) instanceof Cirle);
                System.out.println("editing....");
            }else{
                System.out.println("shape not found!!!");
            }

        }else{
            System.out.println("you have no shapes yet");
        }
    }
    public static void searchShapes(){
        System.out.println("1 -> search by label:");
        System.out.println("2 -> search by index");
        int command = scanner.nextInt();
        if(command == 1){
            System.out.println("Enter the shape label");
            String label = scanner.next();
            for(Object shape : myShapes){
                System.out.println("shape");
            }
        }else{
            System.out.println("shape not found");
        }
        if(command == 2){
            System.out.println("2 -> Enter the shape index");
            command = scanner.nextInt();
        }
        }
    public static void getArea(){
        if(printShapes()){
            System.out.println("enter the shape index than you want to get area");
            int index = scanner.nextInt();
        }
    }
    public static void getVolume(){
        if(printShapes()){
            System.out.println("enter the shape index than you want to get volume");
            int index = scanner.nextInt();
            if( myShapes.contains(myShapes.get(index -1))){
                System.out.println("getting volume");
            }else{
                System.out.println("shape not found!!!");
            }
        }
    }
    public static boolean  groupShapes(){
        if(myShapes.size() == 0){
            System.out.println("you have no shapes yet!!!");
            return  false;
        }
        for (Object shape:myShapes) {
            if (shape instanceof Cirle){
                circles.add(shape);
            }
            if (shape instanceof Square){
                squares.add(shape);
            }
            if (shape instanceof Triangle){
                triangles.add(shape);
            }
            if (shape instanceof Rectangle){
                rectangles.add(shape);
            }
        }
        return true;
    }
}
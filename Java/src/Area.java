import java.util.Scanner;

class Shape {
    int length;
    int breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println(this.length + " " + this.breadth);
    }

}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void area() {
        System.out.println(this.length * this.breadth);
    }

}

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape shape = new Shape(l, b);
        shape.area();

        Shape rectangle = new Rectangle(l, b);
        rectangle.area();
    }
}
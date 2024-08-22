import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rc= new Rectangle();
        Scanner sc =new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        rc.setLength(length);
        rc.setWidth(width);
        System.out.println(rc.toString());
    }
}
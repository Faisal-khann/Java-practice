import java.util.*;
public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Hypotenuse");
        int h = sc.nextInt();
        System.out.println("Enter the value of perpendicular");
        int p = sc.nextInt();
        System.out.println("Enter the value of base");
        int b = sc.nextInt();

        //check right triangle property
        if (h*h == (p*p) + (b*b)){
            System.out.println("Triangle is Right Angle triangle");
        }else {
            System.out.println("Triangle is not Right Angle triangle");
        }
    }
}

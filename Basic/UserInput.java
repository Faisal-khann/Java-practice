import java.util.Scanner;
public class UserInput {
    public static void findEven(int num){
        if (num%2==0){
           System.out.println("Number is even");
        }else {
           System.out.println("Number is odd");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        findEven(num);
    }
}

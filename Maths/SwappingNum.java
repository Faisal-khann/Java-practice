import java.util.Scanner;
public class SwappingNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of num1");
        int num1 = Sc.nextInt();
        System.out.println("Enter the value of num2");
        int num2 = Sc.nextInt();
        System.out.println("Before Swapping : num1 = "+num1+ " & num2 = "+num2);

        //Swapping num1 and num2 by using temp
        int temp = 0;
       temp= num1;
       num1=num2;
       num2=temp;
       System.out.println("After Swapping : num1 = "+num1+" & num2 = "+num2);
     
       Sc.close();
    }
}

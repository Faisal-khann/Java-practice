import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = input.nextInt();
//        int mul = N*i;

        for (int i = 1; i<=10; i++){
            int mul = N*i;
            System.out.println(N+" x "+i+" = "+mul);
        }

    }
}

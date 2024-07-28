public class Fact_byMethod {
static void printFactorial(int num){
    int fact = 1;
    for (int i = 1; i<=num; i++){
        fact = fact * i; //logic of Factorial number as 5! = 5*4*3*2*1; and result store in fact
    }
    System.out.println(num+"! =  "+fact);
}
    public static void main(String[] args) {
        printFactorial(3);
        printFactorial(5);
        printFactorial(6);
        printFactorial(7);

    }
}

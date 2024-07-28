public class Static_Method {
    //Addition by Method

    //Method overloading with some parameter
    static int Sum(int a, int b, int c)
    {
        return a+b+c;
    }
    static double Sum(double  a, double b)
    {
        return a+b;
    }
    static float Sum(float a, float b){
        return  a+b;
    }
   public static void info(){
       System.out.println("My name is charlie");
       System.out.println("Charlie is handsome guys");
       System.out.println(" ");
   }
   public static void cars(){
       System.out.println("Bmw");
       System.out.println("Lamborghini");
       System.out.println("Bugatti");
       System.out.println("Nisan GTR");
       System.out.println(" ");
   }
   public static void phones(){
       System.out.println("Iphone");
       System.out.println("Samsung");
       System.out.println("Sony");
       System.out.println("Oppo");
   }
    public static void main(String[] args) {
        System.out.println("Sum is: " +Sum(45, 15, 5));
        System.out.println("Sum is: "+Sum(4.5f, 5.2f));
        System.out.println("Sum is: "+Sum(9.3, 8.5));

//        myMethod1 m = new myMethod1();
        System.out.println("Here the personal information");
        info(); //Calling static method directly without creating an object

        System.out.println("Here the Cars list");
        cars();

        System.out.println("Here the Phones list");
        phones();
    }
}

public class PrimeNumber {
    //Prime number-- it is divided by 1 and self
    //2 is the only even prime number
    //prime = number>1 && only self derived
    public static void main(String[] args) {
      int num = 6;
//      if(num==2){
//          System.out.println("It is Prime");
//      }
//      if(num>2)
       for(int i =2; i<num; i++){

           if(num%i==0){
               System.out.println("It is Not prime");
               break;
           }
           else {
               System.out.println("It is prime Number");
               break;
           }
       }
    }
}

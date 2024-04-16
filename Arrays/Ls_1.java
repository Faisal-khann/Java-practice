public class Linear_Search1 {
    public static void main(String[] args) {
        int[]arr={5,15,25,20};
        int item =5;
        int temp =0;

        for (int i =0; i< arr.length; i++){
            if (arr[i]==item){
                System.out.println("Element Found at " +i+ " index position");
                temp=temp+1;
            }
        }
        if (temp==0){
            System.out.println("Item not present in List");
        }
    }

}

public class DuplicateElement {
    public static void findDuplicate(int[]arr){
        int n = arr.length;
        System.out.print("Duplicate Element is: ");
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i]==arr[j])
                    System.out.print(arr[j]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {1, 2, 2, 3, 3, 4};
        findDuplicate(arr);
    }
}
//print duplicate element by using two loop when 2 duplicate is present
//first loop for select element and second loop for iteration

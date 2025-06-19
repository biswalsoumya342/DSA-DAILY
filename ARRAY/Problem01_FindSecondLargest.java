import java.util.Arrays;

public class Problem01_FindSecondLargest{
    public static int findSecondLargest(int[] arr){
        Arrays.sort(arr);
        for(int i = arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9};
        System.out.println("Second Largest Is: "+findSecondLargest(arr));
    }
}
import java.util.Arrays;

public class FindSecondLargestNumber {

    public static int findSecondLargest(int... arr){
        
        Arrays.sort(arr);

        for(int i = arr.length-1;i>=1;i--){

            if (arr[i]!=arr[i-1]) {
                return arr[i-1];
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {2,1,25,10,35,50,35,50};

        System.out.println("Second largest Number From "+Arrays.toString(arr)+" Is "+ findSecondLargest(arr));
        
    }
}

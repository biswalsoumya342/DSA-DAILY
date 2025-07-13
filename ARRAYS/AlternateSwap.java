import java.util.Arrays;

public class AlternateSwap {
    public static int[] swapEach(int... arr){
        int start = 0;
        int next = 1;
        int temp =0;
        while (next<arr.length) {
            temp = arr[start];
            arr[start] = arr[next];
            arr[next] = temp;
            start+=2;
            next+=2;
        }
        return arr;
    }
    //We Can Also Swap Using for loop
    public static int[] alternateSwap(int... arr){
        int temp;
        for(int i = 0;i<arr.length-1;i+=2){
            temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]= temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        
        int[] arr = {10,50,1,20,54,84,64,70};
        System.out.println("Before Swap: "+Arrays.toString(arr));

        int[] result = swapEach(arr);
        System.out.println("After Swap: "+Arrays.toString(result));
    }
}

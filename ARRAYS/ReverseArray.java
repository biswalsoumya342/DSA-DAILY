import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int... arr){
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10,50,1,20,54,84,64};
        System.out.print("Before Reverse : ");

        Arrays.stream(arr).forEach(System.out::println);

        int[] reverse = reverseArray(arr);

        

        System.out.print("After Reverse: ");
        Arrays.stream(reverse).forEach(System.out::println);
        
    }
}

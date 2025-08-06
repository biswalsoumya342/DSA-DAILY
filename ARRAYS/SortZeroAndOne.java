import java.util.Arrays;

public class SortZeroAndOne {
    public static int[] sortZeroAndOne(int... arr){

        int start = 0;
        int end = arr.length-1;
        int temp;

        while (start<end) {
            if (arr[start] == 1) {
                if (arr[end] == 0) {
                    temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }else{
                    end--;
                }
            }else{
                start++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(sortZeroAndOne(0,1,1,0,1,0,1,1,1,0,0)));
    }
}

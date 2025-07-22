import java.util.Arrays;

public class Sort0and1 {

    public static void sort0And1(int... arr){
        int start = 0;
        int end = arr.length -1;
        int temp;
        while (start<end) {
            if (arr[start]==1) {
                if (arr[end]==0) {
                    temp = arr[start]; 
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
                end --;
            }else{
                start ++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,0,1,0,0};

        sort0And1(arr);

        System.out.println("After Sorting: "+Arrays.toString(arr));

    }
}

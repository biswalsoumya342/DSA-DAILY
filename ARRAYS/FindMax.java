public class FindMax{
    public static int findMax(int... arr){

        int max = arr[0];

        for(int i = 1;i<arr.length;i++){
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,85,62,47,25,1,2};

        int max = findMax(arr);
        
        System.out.println("Max Number Is :" +max);


    }
}
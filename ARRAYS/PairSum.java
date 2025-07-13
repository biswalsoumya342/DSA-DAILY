public class PairSum {
    public static int pairSum(int target,int... arr){
        // int counter = 0;
        // for(int i =0;i<arr.length;i++){
        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j] == target && i!=j){
        //             counter++;
        //         }
        //     }
        // }
        // return counter;

        //Reduce Time Complexity
        int start = 0;
        int end = arr.length-1;
        int counter = 0;
        while (start<end) {
            int sum = arr[start]+arr[end];
            if (sum == target) {
                ++counter;
                start++;
                end--;
            }
            else if (sum<target) {
                start++;
            }
            else{
                end--;
            }
        }
        return counter;
    }
    public static void main(String... args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Total Sum Of 6 Is: "+pairSum(6, arr));
    }
}

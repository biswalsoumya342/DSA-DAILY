public class FindMin {

    public static int findMin(int... arr){

        int min = arr[0];
        for(int num:arr){
            if (min>num) {
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int[] arr = {2,1,25,10,35,50};

        int min = findMin(arr);

        System.out.println("Min Is :"+min);
        
    }
}

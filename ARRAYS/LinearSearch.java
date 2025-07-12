public class LinearSearch {
    public static int findElement(int target, int... arr){

        for (int i=0;i<arr.length;i++) {
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {10,50,1,20,54,84,64};

        int targetOne = 20;
        int targetTwo = 100;

        int resultOne = findElement(targetOne, arr);

        if(resultOne!=-1) System.out.println(targetOne + " Found At "+resultOne + " Position");
        else System.out.println(targetOne+" Not Found");

        int resultTwo = findElement(targetTwo, arr);

        if(resultTwo!=-1) System.out.println(targetTwo + " Found At "+targetTwo+ " Position");
        else System.out.println(targetTwo+" Not Found");


    }
}

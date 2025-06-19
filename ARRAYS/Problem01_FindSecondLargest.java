//Problem Name: Find the Second Largest Element in an Array
//Question Statement: Given an integer array arr[], write a function to return the second largest unique element in the array. If all elements are the same or second largest doesn't exist, return Integer.MIN_VALUE.

//SOLUTION
import java.util.Arrays;

public class Problem01_FindSecondLargest{
    public static int findSecondLargest(int[] arr){

        //First Sort The Array
        Arrays.sort(arr);

        //Check If The Array Have Same Element In Each Index
        for(int i = arr.length-1;i>0;i--){
            //IF Index Value Not Match Then It Means Values Are Not Same
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
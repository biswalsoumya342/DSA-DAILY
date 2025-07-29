public class Parmutation {
    public static boolean checkParmutation(String str1, String str2){
        int[] arr = new int[256];

        if (str1.length()!=str2.length()) {
            return false;
        }

        int k = 0;
        while (k<str1.length()) {
            int indexFirst = (int)str1.charAt(k);
            int indexSecond = (int)str2.charAt(k);
            arr[indexFirst]++;
            arr[indexSecond]--;
            k++;
        }

        for(int i=0,j=arr.length-1;i<j;i++,j--){
            if (arr[i]!=0 || arr[j]!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkParmutation("1ab-c", "b-ca1"));
    }
    
}

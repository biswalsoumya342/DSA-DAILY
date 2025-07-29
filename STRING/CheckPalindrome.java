public class CheckPalindrome {

    public static boolean checkPalindrome(String input){

        StringBuffer str = new StringBuffer("");
        for(int i = input.length()-1;i>=0;i--){
            str.append(input.charAt(i));
        }

        if (input.equals(str.toString())) {
            return true;
        }

        return false;
    }


    public static boolean checkPalindromeTwoPointer(String str){
        int start = 0;
        int end = str.length()-1;

        while (start<end) {
            if (str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {

        System.out.println(checkPalindrome("soumya"));

        System.out.println(checkPalindromeTwoPointer("maam"));
        
    }
    
}

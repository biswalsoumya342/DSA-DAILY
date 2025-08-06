//Question No 5
package practise;

public class CheckPrimeBetween1To100 {

    public static boolean checkPrime(int num){
        int counter = 0;
        for(int i=1;i*i<=num;i++){
            if (num%i==0) {
                counter = counter+2;
                if (counter>2) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        for(int i = 1;i<=100;i++){
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
        
    }
}

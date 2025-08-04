public class CheckPrimeNumber {
    public static boolean checkPrime(int num){
        int counter = 0;
        for(int i = 1;i<=num;i++){
            if (num%i==0) {
                counter++;
            }
        }
        if (counter==2) {
            return true;
        }
        return false;
    }

    public static boolean checkPrimeOptimised(int num){
        int counter=0;
        for(int i = 1;i*i<=num;i++){
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
        System.out.println("10 Is a prime number: "+checkPrime(10));
        System.out.println("9 Is a prime number: "+checkPrimeOptimised(9));
    }
}

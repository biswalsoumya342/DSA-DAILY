public class FindAllPrimeFactors {
    public static boolean checkPrime(int num){
        int counter = 0;
        for(int i =1;i*i <= num;i++){
            if (num%i==0) {
                counter = counter+2;
                if (counter>2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void findPrimeFactors(int num){
        System.out.print(num + " Prime Factors Are: ");
        for(int i = 1;i<=num;i++){
            if (num%i==0) {
                if (checkPrime(i)) {
                    System.out.print(i+" ");
                }
            }
        }
    }

    public static void findPrimeFactorsOptimised(int num){
        System.out.print(num + " Prime Factors Are: ");
        for(int i = 1;i*i <= num;i++){
            if (num%i==0) {
                if (checkPrime(i)) {
                    System.out.print(i+" ");
                }
                if (num/i!=i) {
                    if (checkPrime(num/i)) {
                     System.out.print(i+" ");
                }
                }
            }
        }
    }
    public static void main(String[] args) {
        findPrimeFactors(36);
        System.out.println();
        findPrimeFactorsOptimised(36);
    }
}

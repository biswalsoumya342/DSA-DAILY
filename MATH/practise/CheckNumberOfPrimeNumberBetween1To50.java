//Question No 6
package practise;

public class CheckNumberOfPrimeNumberBetween1To50 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i * i <= 50; i++) {
            if (CheckPrimeBetween1To100.checkPrime(i)) {
                counter++;
            }
        }
        System.out.println("Total primenumber between 1 to 50 Is: "+counter);
    }
}

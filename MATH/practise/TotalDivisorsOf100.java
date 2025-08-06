//Question No 2
package practise;

public class TotalDivisorsOf100 {
    public static void main(String[] args) {
        int num = 100;
        int counter = 0;
        for (int i = 1; i*i <= num; i++) {
            if (num%i == 0) {
                counter++;
                if (num/i != i) {
                    counter++;
                }
            }

        }
        System.out.println("Total Divisor Of 100 Is : " + counter);
    }
}

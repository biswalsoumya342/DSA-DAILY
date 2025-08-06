//Question No 1
package practise;

public class FindAllDivisorsOf36 {

    public static void main(String[] args) {

        int num = 36;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                if (num / i != i) {
                    System.out.println(num / i);
                }
            }

        }

    }

}

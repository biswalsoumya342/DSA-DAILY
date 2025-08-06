//Question No 3
package practise;

public class PrintAllDivisors {
    public static void printAllDivisors(int num){
        System.out.print("All Divisors Of "+num+" Is : ");
        for(int i = 1;i*i<=num;i++){
            if (num%i==0) {
                System.out.print(i+", ");
                if (num/i!=i) {
                    System.out.print(num/i+", ");
                }
            }
        }
    }
    public static void main(String[] args) {

        printAllDivisors(50);
    }
}

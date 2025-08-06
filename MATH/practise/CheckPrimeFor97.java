//Question No 4
package practise;

public class CheckPrimeFor97 {
    public static void main(String[] args) {
        int num = 97;
        int counter = 0;
        for(int i = 1;i*i<=num;i++){
            if(num%i==0){
                counter = counter+2;
                if (counter>2) {
                    break;
                }
            }
        }
        if (counter==2) {
            System.out.println("It Is A Prime Number");
        }else{
            System.out.println("It is Not A prime Number");
        }
    }
    
}

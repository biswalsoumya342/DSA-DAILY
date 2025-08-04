public class PrintAllDivisors {

    //Time Complexty is O(n)
    public static void allDivisors(int num){
        for(int i = 1;i<=num;i++){
            if (num%i==0) {
                System.out.println(i);
            }
        }
    }


    //Time Complexity is O(sqrt(n))
    public static void allDivisors2(int num){
        for(int i =1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(i);
                System.out.println(num/i);
            }
        }
    }

    public static void main(String[] args) {
        allDivisors(36);
        
        //allDivisors2(32);
    }
    
}

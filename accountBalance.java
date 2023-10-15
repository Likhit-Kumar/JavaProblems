import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    String s;
    InsufficientBalanceException(String s){
        this.s=s;
}
public String insuffbal(){
    return s;
    }
}
public class accountBalance {
    public static void main(String args[]){
        int balance =10000;
        while(balance!=0){
            if(balance<=1000){
                try {
                    throw new InsufficientBalanceException("Insufficient Balance");
                } catch (InsufficientBalanceException e) {
                    System.out.println(e);
                    break;
                }
            }
         System.out.println("Enter the amount to be Debited");
         Scanner sc = new Scanner(System.in);
         int bal = sc.nextInt();
         balance-=bal;
         System.out.println("Remaining Balance: "+balance);
        }
        
    }
}
import java.util.*;

public class fibo {

    public static void main(String[] args) {

        int count , num1 = 0, num2 = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the count of the Fibonacci Series");
        count = scan.nextInt();

        System.out.print("Fibonacci Series of "+count+" numbers:");
        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
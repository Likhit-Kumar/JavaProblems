import java.util.*;

public class T_throw {  
    public static void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  

    public static void main(String[] args) {  
            T_throw obj = new T_throw();  
            Scanner inp = new Scanner(System.in);
            int s = inp.nextInt();
            obj.checkNum(s);  
    }  
}  
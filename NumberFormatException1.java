import java.util.*;

public class NumberFormatException1 {  
    
      
    public static void main(String[] args) {  

        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        try {  
            int a = Integer.parseInt(s);  
            System.out.println("The Given Input " + a + " is valid");

        } catch(NumberFormatException ex) {  
            System.err.println("Invalid string in argumment");  
        }  
    }  
}  
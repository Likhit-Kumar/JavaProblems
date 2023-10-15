import java.util.*;

public class p_finally {
          
    public static void main(String[] args) {  

        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        try {  
            int a = Integer.parseInt(s);  
            System.out.println("The Given Input " + a + " is valid");

        } catch(Exception e) {  
            System.out.println("Invalid string in argumment");  
        }  
        finally {
            System.out.println("Input String " + s);
        }
    }  
}

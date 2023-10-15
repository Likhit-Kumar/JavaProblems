import java.util.*;

public class endswith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Strings");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        String end_str = "it";

        boolean e1 = s1.endsWith(end_str);
        boolean e2 = s2.endsWith(end_str);

        System.out.println("The Given String " + s1 + " ends with " + end_str + " - " + e1);
        System.out.println("The Given String " + s2 + " ends with " + end_str + " - " + e2);
    }
    
}

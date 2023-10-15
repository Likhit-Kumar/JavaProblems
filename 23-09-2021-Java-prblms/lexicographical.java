
import java.util.*;

public class lexicographical {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Strings");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();
        String s4 = scan.nextLine();

        System.out.println("The Compared Strings in Lexicographical Order are \n");
        System.out.println("String " + s1 + " compared with " + s2 + " " + s1.compareTo(s2));
        System.out.println("String " + s1 + " compared with " + s3 + " " + s1.compareTo(s3));
        System.out.println("String " + s1 + " compared with " + s4 + " " + s1.compareTo(s4));
    }   
}

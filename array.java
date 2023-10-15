import java.io.*;

class array {
     public static void main(String args[]) throws IOException {
          int a[]=new int[10];
          int i = 0;

          do {
              a[i] = i;
               System.out.print(a[i] + " ");
               i++;
          }while (i < 10);
     }
}
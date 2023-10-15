import java.io.*;
import java.util.*;

class sortColor {
  public void sortColors(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      for(int j = i+1; j < nums.length; j++) {
        if(nums[i] > nums[j]) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }

    for(int i = 0; i< nums.length; i++) {
      System.out.println(nums[i]);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] array = new int[n];
    for(int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }
    
    sortColor m =new sortColor();
    m.sortColors(array);  }
}
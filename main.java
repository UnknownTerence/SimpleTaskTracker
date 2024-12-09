/*
 * Terence Nguyen
 * Dec. 8, 2024
 * Task Tracker
 */

import java.util.Scanner; // imports scanner class


public class Main {

  public static void main(String[] args) {
    int[] arr = {1,2,3};

    System.out.println("Hello Welcome to Simple Task Tracker!");
    System.out.println("\nPlease select an option below\n");
    System.out.println("[1] View Completed Tasks\n[2] View In-Progress Tasks\n[3] View Unfinished Tasks");
    CheckInput(arr);
  }

  private static int CheckInput(int[] arr) {
    try {
      Scanner scan = new Scanner(System.in);
      boolean valid = false;

      int input = scan.nextInt();
      scan.close();

      for (int i=0;i<arr.length;i++) {
        if (input == arr[i])
          valid = true;
      }

      if (valid)
        return input;
      else
        System.out.println("Invalid Input");
    } catch (Exception e) {
      System.out.println("Error: Please Try Again");
      System.out.println(e);
    }
    return 0;
  }
}

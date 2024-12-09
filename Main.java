/*
 * Terence Nguyen
 * Dec. 8, 2024
 * Task Tracker
 */

// if want color, use ANSI

import java.io.*; // all file io stuff
import java.util.Scanner; // imports scanner class


public class Main {

  public static void main(String[] args) throws InterruptedException {
    int[] arr = {1,2,3,4};
    int input;

    do {
      input=0;
      System.out.println("Hello Welcome to Simple Task Tracker!");
      System.out.println("\nPlease select an option below\n");
      System.out.println("[1] View Tasks\n[2] Exit");
      input = CheckInput(arr);

      Thread.sleep(1000);

      if (input == 1)
        ViewTasks();

    } while(input!=2);
  }


  private static int CheckInput(int[] arr) {
    try {
      Scanner scan = new Scanner(System.in);
      boolean valid = false;

      int input = scan.nextInt();
      scan.nextLine(); // since nextInt only gets the integer and not the \n linebreak
      
      // checks if the input is valid
      for (int i=0;i<arr.length;i++) {
        if (input == arr[i])
          valid = true;
      }

      if (valid)
        return input;
      else
        System.out.println("Invalid Input\n");
    } catch (Exception e) {
      System.out.println("Error: Please Try Again\n");
      System.out.println(e);
    }
    return 0; // satifies the function output (user invalid input)
  }

  // Viewing Tasks
  private static void ViewTasks() {
    try {
      BufferedReader br = new BufferedReader(new FileReader("data/tasks.txt"));


    } catch (FileNotFoundException e) {
      System.out.println("You do have have any tasks!");
      // add line that redirects them back to the menu or adding tasks
      // or maybe just print out no tasks
    }
  }
}

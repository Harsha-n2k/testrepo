import java.util.Scanner;

public class IfDemo {
	 static Scanner sc = new Scanner(System.in);

		/*
		 * global variable should be declared as static if declared out side main method
		 */
  public static void main(String[] args) {
	  System.out.println("Welcome to Voting app");
	  System.out.println("Please enter your age:");
	  int age=sc.nextInt();
	  if (age>=18)
	  {
		  System.out.println("You are allowed to vote");
	  }
	  System.out.println("Thank you!!");
  }
}

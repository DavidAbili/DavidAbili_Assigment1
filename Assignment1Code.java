import java.util.Scanner;
/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 9/16/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */
public class Assignment1Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//initializes variable
		String answer = " ";

		// prompts user and if their answer is yes exits loop 
		// but if its no the loop continues 
	    System.out.println("Reboot the computer and try to connect");
		System.out.println("Did that fix the problem(y or n):");
		answer = input.nextLine();
		if(answer.equals("n")) {
			System.out.println("Reboot the router and try to connect");
			System.out.println("Did that fix the problem(y or n):");
			answer = input.nextLine();
			if(answer.equals("n")) {
				System.out.println("Make sure that the cables connecting the router are firmly ");
				System.out.println("plugged in and power is getting to the router");
				System.out.println("Did that fix the problem(y or n):");
				answer = input.nextLine();
				if(answer.equals("n")) {
					System.out.println("Move your computer closer to the router and try to connect");
					System.out.println("Did that fix the problem(y or n):");
					answer = input.nextLine();
				  if(answer.equals("n")) {
					  System.out.println("Contact your ISP");
				  }
				}
			}
		}
		System.out.println("Done");
	}

}

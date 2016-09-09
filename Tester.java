import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i = kbScanner.nextInt();
		if (i % 2 == 0){
			System.out.println("The integer " + i + " is even.");
		}
		else {
			System.out.println("The integer " + i + " is odd.");
		}
	}

}


import java.util.Scanner;

public class Maa {
	// main method
	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write any string ");
		String parent = scanner.nextLine();
		System.out.println("Enter the substring which you want to check");
		String sub = scanner.nextLine();
		boolean value = parent.contains(sub);
		// if condition
		if (value) {
			System.out.println("The substring is a part of Parent string");
		} else {
			System.out.println("It is not a part of parent string");
		}
	}
}

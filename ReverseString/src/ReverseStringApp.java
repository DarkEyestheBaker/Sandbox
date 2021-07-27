import java.util.Scanner;

public class ReverseStringApp {

	public static void main(String[] args) {

		public static void main(String[] args) {

			System.out.println("Enter words to be reversed here:   ");

			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String a[] = input.split(" ");

			System.out.print("Reversed string =  ");
			for (int i = a.length - 1; i >= 0; i--) {
				System.out.print(a[i] + ", ");
			}
		}
	}

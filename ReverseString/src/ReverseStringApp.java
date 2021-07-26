public class ReverseStringApp {

	public static void main(String[] args) {

		String str = "are, you, as, bored, as, I, am";
		System.out.println(str);
		String a[] = str.split(",");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ", ");
		}

	}

}

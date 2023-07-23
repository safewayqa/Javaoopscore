import java.util.Scanner;

public class Woveldelete {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the data");
		String data = input.nextLine();

		String rev = "";

		char[] ar = data.toCharArray();

		for (int i = 0; i < data.length(); i++) {

			if (ar[i] == 'a' || ar[i] == 'e' || ar[i] == 'i' || ar[i] == 'o' || ar[i] == 'u') {
				System.out.println();
			} else {
				rev = rev + ar[i];

			}
		}
		System.out.println(rev);

		System.out.println(rev.replaceAll("\\s", ""));

	}

}

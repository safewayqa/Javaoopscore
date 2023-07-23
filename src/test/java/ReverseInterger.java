
public class ReverseInterger {

	public static void main(String args[]) {

		int number = 12345;
		int rev = 0, remainder;

		while (number != 0) {
			remainder = number % 10;

			rev = (rev * 10) + remainder;
			number = number / 10;

		}

		System.out.println(rev);

	}

}

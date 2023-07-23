
public class Aromstrong {

	public static void main(String[] args) {

		int number = 153, temp, result = 0, reminder;

		temp = number;

		while (number != 0) {

			reminder = number % 10;

			result = (int) (result + Math.pow(reminder, 3));

			number = number / 10;
		}

		if (result == temp) {
			System.out.println("It is Armstron");
		} else {

			System.out.println("IT is not Armstrong");
		}
	}
}

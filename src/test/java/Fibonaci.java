import java.util.Scanner;

public class Fibonaci {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int count = sc.nextInt();
		int num1 = 0, num2 = 1, num3;

		for (int i = 0; i < count; i++) {

			num3 = num1 + num2;

			System.out.println("fibonacee number is" + num3);

			num1 = num2;
			num2 = num3;

		}

	}

}

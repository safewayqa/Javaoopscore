import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		int sum1 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int n = sc.nextInt();

		System.out.println(n);
		while (n != 0) {
			int sum = n % 10;
			sum1 = sum + sum1;
			n = n / 10;

		}
		System.out.println(+sum1);
	}
}


public class PrimeNumber {

	public static void main(String[] args) {

		int i, n = 5;
		boolean isPrime = true;

		if (n < 2) {

			isPrime = false;
		} else {

			for (i = 2; i < n; i++) {
				System.out.println(i);
				if (n % i == 0) {

					isPrime = false;
					break;
				}
			}
		}
		String result = isPrime ? "Prime" : "not Prime";
		System.out.println("The number " + n + " is : " + result);

	}

}

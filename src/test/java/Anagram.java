import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "Grab";
		String str2 = "RAFI";

		String up = str1.toUpperCase();
		System.out.println(up);

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Both are not anagram");
		} else {
			System.out.println("It is Anagram");
		}

		char[] str11 = str1.toCharArray();
		char[] str22 = str2.toCharArray();

		Arrays.sort(str11);
		Arrays.parallelSort(str22);

		if (Arrays.equals(str11, str22)) {
			System.out.println("Both the strings are anagram");
		} else {
			System.out.println("Both the strings are NOT anagram");
		}
	}

}


public class ReverseString {

	public void pallandrom() {
		// TODO Auto-generated method stub

		String originalStr = "madam";
		String rev = "";

		for (int i = 0; i < originalStr.length(); i++) {
			rev = originalStr.charAt(i) + rev;

			// System.out.println("Reversed string: "+ rev);

		}
		if (originalStr.equalsIgnoreCase(rev)) {

			System.out.println("IT is pallandrom");
		} else {
			System.out.println("NOT apallandrom");
		}
	}

}
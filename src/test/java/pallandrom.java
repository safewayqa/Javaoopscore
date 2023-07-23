
public class pallandrom {

	public static void main(String[] args) {

		/*
		 * int number=434, rev=0,reminder;
		 * 
		 * int temp=number; while(number!=0) { reminder=number%10;
		 * rev=(rev*10)+reminder;
		 * 
		 * 
		 * number=number/10;
		 * 
		 * } System.out.println(rev);
		 * 
		 * 
		 * if(rev==temp) { System.out.println("It is pallandrom"); }else {
		 * System.out.println("Not apallandrom"); } }
		 */
		String pall = "Rafi";
		char[] pall1 = pall.toCharArray();

		String rev = "";

		for (int i = 0; i < pall.length(); i++) {
			rev = pall1[i] + rev;

		}
		System.out.println(rev);
	}
}
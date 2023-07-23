
public class Stringremovechar {

	public static void main(String[] args) {
		int count = 0;
		String ss = "";
		String ss1 = "";
		String str = "Rafi Mohammed Razaq";
		String str2 = "Rehan";
		char[] ar = str.toCharArray();

		char Remov = 'q';

//		String ss=str.replaceFirst("Moh", "");
		str.toCharArray();
//		System.out.println(ss);
		ss1 = str.concat(str2);
		System.out.println(ss1);
		for (int i = 0; i < str.length(); i++) {

			count = str.length();

			if (ar[i] != Remov)
				ss += ar[i];
		}

		System.out.println(ss);
		System.out.println(count);

//	int ff=	str.length();
//		System.out.println(ff);
	}

}

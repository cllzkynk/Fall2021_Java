package day13_stringManipulations;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz String
		 * str1 = “$13.99” String str2 = “$10.55” ipucu : Double.parseDouble() methodunu
		 * kullanabilirsiniz.
		 */
		String str1 = "$13.99";
		String str2 = "$10.55";

		String str1Regular = str1.replaceAll("\\D", "");
		System.out.println(str1Regular);

		String str2Regular = str2.replaceAll("\\D", "");
		System.out.println(str2Regular);

		double str1D = Double.parseDouble(str1Regular)/100;
		double str2D = Double.parseDouble(str2Regular)/100;

		System.out.println(str1D + str2D);
	}

}

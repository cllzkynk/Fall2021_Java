package day13_stringManipulations;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini “Java
ogrenmek cok guzel.” sekline getirin.

		 */
		
		String str="Java ogrenmek123 Cok guzel@ ";
		String strRegular=str.replaceAll(" ", "x").replaceAll("\\d", "").replaceAll("@", ".").replaceAll("x", " ").trim().replace('C', 'c');
		System.out.println(strRegular);
		
		
	}

}

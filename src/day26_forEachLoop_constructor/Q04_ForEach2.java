/**
 * 
 */
package day26_forEachLoop_constructor;

/**
 * @author CELÝL
 */
public class Q04_ForEach2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
yazdiriniz. ipucu: split()
		 */
		String str="Eger gercekten isiten kulaklara sahipsek , Yaratan bize kendi dilimizde seslenir";
		String arr []=str.split("");
		for (String string : arr) {
			System.out.print(string+" ");
		}
	}

}

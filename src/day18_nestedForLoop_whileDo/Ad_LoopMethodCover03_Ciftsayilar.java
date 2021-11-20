/**
 * 
 */
package day18_nestedForLoop_whileDo;

/*
 * @author CELÝL
 *
 */
public class Ad_LoopMethodCover03_Ciftsayilar {
	public static void main(String[] args) {
		// loop kullanmadan 100-0 arasindaki cift sayilari yazdiriniz

		int sayi = 100;
		cift(sayi);
		System.out.print(cift(sayi));

	}// main sonu

	public static int cift(int sayi) {
		if (sayi == 0) {
			return 0;
		}
		System.out.print(sayi + " , ");
		return cift(sayi - 2);

	}

}// class sonu

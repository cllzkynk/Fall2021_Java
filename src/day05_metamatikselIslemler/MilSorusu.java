package day05_metamatikselIslemler;
import java.util.Scanner;

public class MilSorusu {

	public static void main(String[] args) {
		// Mil cinsinden ortalama hýz) Bir koþucunun 14 kilometreyi 45 dakika 30
		// saniyede koþtuðunu varsayalým.
		// Ortalama hýzý mil/saat cinsinden gösterecek bir program yazýnýz. ( 1 mil, 1.6
		// kilometredir.)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kostugunuz mesafeyi km cinsinden giriniz");
		double km = scan.nextDouble();

		double kmToMil = km * 1.6;

		System.out.println("Lutfen kostugunuz surenin Dk'sini giriniz");
		int sureDk = scan.nextInt();

		System.out.println("Lutfen kostugunuz surenin Sn'sini giriniz");
		int sureSn = scan.nextInt();

		double sureSaat = (double) (sureDk * 60 + sureSn) / 3600; // saat olucak

		double ortalama = kmToMil / sureSaat;

		System.out.println("Ortalama hiziniz :  " + ortalama + "  mil/saattir.");
		
		scan.close();
		
		

	}

}

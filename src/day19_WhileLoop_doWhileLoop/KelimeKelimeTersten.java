package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class KelimeKelimeTersten {
@SuppressWarnings("unused")
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen isminizi ve kac kelime oldu�unu girin");
	String isim=scan.nextLine();
	int num = scan.nextInt();
	String isimFormatliSon="";
	
	
	for(int i=1; i<num; i++) {
		
		if(isim.contains(" ")) {
			int idxSonBosluk = isim.lastIndexOf(" ");
			String station = isim.substring(idxSonBosluk+1);
			System.out.print(station+ " ");
			isim=isim.substring(0, idxSonBosluk);
		}
	} System.out.println(isim);
	scan.close();
}

}

package day13_stringManipulations;

import java.util.Scanner;

public class StringManipulationsWorkSheet {

	public static void main(String[] args) {
		String str1 = "Düþünebilen herkesin insan olmasý, insan olan herkesin düþünebildiði manasýna gelmiyor ne yazýk ki."; // 99
		String str2 = "Düþünebilen herkesin insan olmasý, insan olan herkesin düþünebildiði manasýna gelmiyor ne yazýk ki.";
		String str3 = "düþünebilen herkesin insan olmasý, insan olan herkesin düþünebildiði manasýna gelmiyor ne yazýk ki.";

		String cumle1 = "Üzerinde durduðun topraðýn, en fazla ayaklarýnýn kapladýðý yer kadar olduðunu fark edince mutluluk neymiþ anlarsýn...";
		String cumle2 = "Üzerinde durduðun topraðýn, en fazla ayaklarýnýn kapladýðý yer kadar olduðunu fark edince mutluluk neymiþ anlarsýn...";

		String kelime1 = "                    Ýnsanýn belli baþlý iki günahý vardýr, öbürleri bunlardan çýkar: sabýrsýzlýk ve tembellik.";
		String kelime2 = "Ýnsanýn belli baþlý iki günahý vardýr, öbürleri bunlardan çýkar: sabýrsýzlýk ve tembellik.";

		String ornek1 = "ortadoðu çöl deðil, çocuk gözyaþýndan oluþan nehirleri var.";
		String ornek2 = "ortadoðu çöl deðil, çocuk gözyaþýndan oluþan nehirleri var.";
		System.out.println("***********************ORNEKLER***************");

		
		
		System.out.println("***********************Concatenation***************");
		/*
		 * Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri
		 * veya her ikisi String ise Java toplama degil BIRLESTIRME yapar.
		 */
		System.out.println("Concat Ornek : " + cumle1 + ornek1);

		
		
		
		
		System.out.println("***********************CharAt()***************");

		/*
		 * String “charAt” Method indexi ver karakteri al sadece karakter sadece sayi
		 * kabul eder do char return
		 */

		System.out.println("charAt ornek konumu ver harfi al : " + str1.charAt(0));

		
		
		
		
		System.out.println("***********************Contain***************");
		/* Method: contains // Icerme sorgusu do boolean return */

		System.out.println("containsornek istedigin bi char dizisi  ara : " + str1.contains("ol")); // istedigin bi char
																									// dizisi ara
		System.out.println("containsornek istedigin baska bi stringi ara  : " + str1.contains(cumle2)); // istedigin
																										// baska bi
																										// stringi ara
		System.out.println("containsornek tek  harf ara  : " + str1.contains("n")); // tek harf ara

		
		
		
		
		
		System.out.println("***********************Equals***************");
		/* Method: equals esit mi ? boolean return */
		System.out.println("equals ornek : " + str1.equals(str2));
		System.out.println("equals ornek : " + kelime1.equals(cumle1));
		System.out.println("equals ornek : " + str1.equals(str3));

		
		
		
		
		
		System.out.println("***********************Length***************");
		/*
		 * String “Length” Method String in uzunlugunu dondurur int return eder 1 den
		 * baslar index 0 dan baslar son harfi istersen .length()-1 demelisin
		 */
		System.out.println("length() ornek : " + str1.length());

		
		
		
		
		
		System.out.println("***********************stripLeading()***************");
		/* stripLeading() Stringin sadece basindaki bosluklari alip duzenli yazdiri */
		String stripLeadingOrnek = "              insanlarla iç içe olmak, insaný kendini gözlemlemeye götürür.    ";
		System.out.println("stripLeadingOrnek : " + stripLeadingOrnek.stripLeading());// cikti : insanlarla iç içe
																						// olmak, insaný kendini
																						// gözlemlemeye götürür.
		// bastaki bosluklar gitti

		
		
		
		
		System.out.println("***********************indexOf***************");
		// String “indexOf” Method aradigin neyse yerini verir
		// karakter veye char dizisi olabilir int return eder bulamazsa -1 dondurur

		System.out.println("indexOf ornek :  " + kelime1.indexOf("iki")); // char dizisi arar
		System.out.println("indexOf ornek :  " + kelime1.indexOf('t')); // char arar

		
		
		
		
		
		System.out.println("***********************Contain***************");

		// String “Contain” Method string in istedigimiz char veya char dizesini icerip
		// icermedigine bakar

		System.out.println(str1.contains("insan"));
		System.out.println(kelime1.contains(ornek2));

		
		
		
		
		
		System.out.println("***********************endsWith***************");
		// String “endsWith” Method string istedigimiz seyle bitiyor mu diye bakar

		System.out.println(ornek2.endsWith("var."));
		System.out.println(str1.endsWith("ki")); // noktayi almadim

		
		
		
		
		
		System.out.println("***********************startsWith***************");
		// startsWith ile basliyormu diye bakar true false doner
		System.out.println(str1.startsWith("D")); // ister char
		System.out.println(str1.startsWith("Düþüne")); // ister chat dizesi

		
		
		
		
		
		
		System.out.println("***********************replace***************");
		// String “replace” char veye char dizesiniz istedigimiz char ile degistirir.
		System.out.println(str1);
		System.out.println(str1.replace('ü', 'u')); // ü lerin hepsini u yaptik
		System.out.println(str1.replace("üþü", "usu")); // üþü leri usu yaptik
		System.out.println(str1.replace("üþü", "usu").replace('ð', 'g')); // artarda kullanarak ð den de kurtulduk
		System.out.println(str1.replace('x', 'q')); // olmayan bisi girersen etliye sutluye karismaz

		
		
		
		
		
		System.out.println("***********************replaceAll***************");
		// String “replaceAll” char veye char dizesiniz istedigimiz char veye char
		// dizesi ile degistirir. replace den farki replacede neyi degiseceginiz biz
		// girmeliyiz ma bunda harf olmayan rakam olmayan gibi genellemeler yapabiliriz

		System.out.println(cumle1.replaceAll(" ", "x_BOSLUK_x")); // tum spaceleri x_BOSLUK_x ile degistirdik
		System.out.println(cumle1.replaceAll("\\w", "x")); // harf olmayan herseyi supurduk tr karakterler harf
															// sayilmiyor

		
		
		
		
		
		System.out.println("***********************tolowercase & touppercase***************");
		// String Java “tolowercase” & Java “touppercase” Method Stringi buyuk veya
		// kucuk harfe donusturme
		System.out.println(kelime1.toLowerCase());
		System.out.println(cumle1.toUpperCase());

		
		
		
		
		
		System.out.println("***********************Sub-string String***************");
		// Sub-string Stringde istedigimiz indexler arasini almamiza yarar

		System.out.println(str1.substring(5)); // 5.indexten sonrasini yazdirir
		System.out.println(str1.substring(5, 25)); // 5.index ile 25.index arasini yazdirir string cikarir bu stringtir
													// metodlari coktur
		System.out.println(str1.subSequence(5, 25)); //// 5.index ile 25.index arasini yazdirir char dizisi cikarir bu
														//// char dizisidir az metod
		// farklari secerken icinde yaziyor biri charSquarence biri string cikarir diye

		
		
		
		
		
		
		
		
		
		
		System.out.println("***********************trim()***************");
		// trim() basta ve sonda ki bosluklari kirpar
		System.out.println(kelime1);
		System.out.println(kelime1.trim());

		
		
		
		
		
		
		
		
		
		
		
		System.out.println("***********************IsEmpty()***************");
		// String IsEmpty() String bos mu dolu mu dondurur
		String isempty = "";// bos
		String isempty1 = " "; // degil
		// String isempty2=null; bunda bos dulu sorulmaz hata verir
		String isempty3 = "Ah yalan dunya"; // degil
		System.out.println(isempty.isEmpty());
		System.out.println(isempty1.isEmpty());
		// System.out.println(isempty2.isEmpty());
		System.out.println(isempty3.isEmpty());

		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("***********************ValueOf()***************");

		// String ValueOf() baska bisiyi Stringe dondurur.
		int sayi = 100000; // bu primativedir uzerinde cok bisi yapamayiz metodlari yok
		boolean bl = true;
		char ch = 'c';
		String sayiToString = String.valueOf(sayi);
		String blToString = String.valueOf(bl);
		String chToString = String.valueOf(ch);
		System.out.println(sayi + "---" + sayiToString);
		System.out.println(bl + "---" + blToString);
		System.out.println(ch + "---" + chToString); /// ayni seyleri yazarlar ama birinin turu primativve birinin non
														/// primative

		
		
		
		
		
		
		
		
		
		System.out.println("***********************equals()***************");
		// String equals() Stringler ayni mi diye bakar equalsIgnoreCase(): de buyuk
		// kucuk harf onemsiz // ici disi turu herseyi ayni olmali

		System.out.println(cumle1.equals(cumle2));
		System.out.println(kelime1.equals(kelime2));

		String eqsayi = "1000";
		int eqsayii = 1000;
		System.out.println(eqsayi.equals(eqsayii)); // degerler ayni ama turler farkli biri string biri int
		
		
		
		
		
	
		
		
		System.out.println("***********************replace***************");
		// istenenin yerine istenileni yazar 
		// ornek soru 
		
		//Soru : Kullaniciya mail agresini sor eger hotmail girerse onu gmail yap
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email giriniz");
		String email = scan.next();
		
		if(email.contains("hotmail")){
			email = email.replace("hotmail", "gmail");// hotmail yerine gmail yazdik
		}
		System.out.println(email);
		
		scan.close();
		
		
		
		
		

	}

}

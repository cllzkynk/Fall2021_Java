package day04_IncrementDecrement;

public class C08_Odev {

	public static void main(String[] args) {
		/*		Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde 
		birer degisken olusturup adim adim widening yapin ve yazdirin
				Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
				Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
				Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip 
		yazdirin
				Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
				Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
				Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdirali */

		//Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde 
		//birer degisken olusturup adim adim widening yapin ve yazdirin
		
		System.out.println("------------------------------CEVAP1------------------------------");
		byte sayi1= 44;
		
		short sayi2; int sayi3;  float sayi4;   double sayi5;
		 
		sayi2= sayi1 ;     	sayi3=sayi2 ; 	sayi4=sayi3 ;  	sayi5=sayi4;
		
		
		
		System.out.println("Sayi1  : " +sayi1 + "\nsayi2  : "+sayi2+ "\nsayi3  : "+sayi3+ "\nsayi4  : "+sayi4+ "\nsayi5  : "+sayi5);
		
		
		System.out.println("------------------------------CEVAP2------------------------------");
		
		//Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		
		int int1=11 ;   short short1 = 0; byte byte1=0 ;
		
		short1=(short)int1 ;
		byte1=(byte) short1 ;
		
		System.out.println("Integer int1  : "+int1 + "\nShort short1  : "+short1 + "\nByte byte1    : "+byte1);
		
		System.out.println("------------------------------CEVAP3------------------------------");
		
		 //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
		
		float float1= 458575528555f;
		
		System.out.println("Float sayimiz  : "+ float1);
		
		System.out.println("------------------------------CEVAP4------------------------------");
		
		//Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip 
		// yazdirin
		
		double double1=255.36 ;
		System.out.println("Double sayimiz                                    : "+double1);
		int int2= (int) double1 ;
		System.out.println("Doublenin integer'a donusmus hali                 : "+int2);
		byte byte2=(byte) int2 ;
		System.out.println("Doubleden integer'a sonrada byte'a donusmus sayi  : "+ byte2);
		
		System.out.println("------------------------------CEVAP5------------------------------");
		
		// Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		
		int int3= 127 ;
		int int4= 23  ;
		System.out.println("127/23 isleminin sonucu :  " + int3/int4 + "\niki islemde integer oldugu icin sonucu integer verdi ondalikli kismi atti");

		System.out.println("------------------------------CEVAP6------------------------------");
		
		//Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		
		int int5=55 ;
		double double2= 14.52 ;
		System.out.println("55/14.52 sayisinin bolme sonucu  : "+int5/double2 + "\nIsleme girenlerden buyuk olani yani daha garanti olani aldi "
				+ "\nburada double integer dan daha genis oldugu icin sonucu double verdi");
		
		System.out.println("------------------------------CEVAP7------------------------------");
		
		//Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdirali */
		
		byte a=14 ; short b=2544 ; int c=5858585 ; long d = 9856669564952162l; float f=154756.65986f;  double g= 8589658646456.5895452369898456262369563 ;
		
		System.out.println("toplamalar ; "+ "\na+b  :"+ a+b+"\nd+g  : " +d+g + "\nf+c   :"+f+c);
		
		System.out.println("carpmalar ; "+ "\nc*g  :"+ (c*g)+"\nd*f  : " +(d*f) + "\nb*a   :"+(b*a));
		
		System.out.println("bolmeler ; "+ "\ng/f  :"+ (g/f)+"\nd/c  : " +(d/c) + "\nb/a   :"+(b/a));

		System.out.println("farklar ; " + "\ng-d  :"+ (g-d)+"\nf-g  : " +(f-g) + "\na-c   :"+(a-c));
		
	}

}

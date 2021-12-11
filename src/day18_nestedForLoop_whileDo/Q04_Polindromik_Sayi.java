package day18_nestedForLoop_whileDo;

public class Q04_Polindromik_Sayi {

	public static void main(String[] args) {
		/*
		 * �ki taraftan okundu�u zaman ayn� olan do�al say�lara polindromik say�lar
		 * denir. Tersten yaz�ld�klar�nda de�i�mezler. �rne�in;
		 * 
		 * 
		 * 
		 * 11 � 22 � 33 � 44 � 55 � 66 � 77 � 88 � 101 � 121 � 131 � 10201 � 12321 �
		 * 14641 gibi.
		 * 
		 * 
		 * 
		 * �yleyse 1000 ile 10000 aras�ndaki polindromik say�lar� yazd�ran Java
		 * kodlar�n� olu�turunuz
		 */
		int yuzler,onlar,birler,binler;
        for(int i=1000;i<10000;i++){
            
            binler=i/1000; 
            yuzler=i/100-10*binler;
            onlar=i/10-100*binler-10*yuzler;
            birler=i-(binler*1000+yuzler*100+onlar*10);
            
            
            
            if(binler== birler&& yuzler==onlar){
                System.out.println(i+" Polindromik Sayidir.");
            }
        }
        
        
    }

}

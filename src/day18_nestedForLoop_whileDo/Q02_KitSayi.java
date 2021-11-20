package day18_nestedForLoop_whileDo;

public class Q02_KitSayi {
	public static void main(String[] args) {
		
	/*	N pozitif bir tamsayý olmak üzere, N sayýnýn pozitif bölenleri toplamý (n)’dir.(n) < 2N ise N sayýsý kýt sayýdýr. 

		Örneðin;

		10 sayýsýný düþünelim. Bu sayýnýn bölenleri: 1, 2, 5 ve 10.

		(n) = 1+2+5+10 = 18

		2n = 2*10 = 20

		(n) > 2n olduðu için 10 sayýsý, kýt sayý özelliðini taþýr.   */

	int toplam=0;
    
    for(int i=10;i<50;i++){
        for(int j=1;j<=i;j++){
            
            if(i % j == 0){
                toplam+=j;                  
            }               
            
        }

        if(toplam < (i*2)){
            System.out.println(i+" Sayýsý Bir Kýt Sayýdýr.");
        }
        
        toplam=0;
    }
}

}
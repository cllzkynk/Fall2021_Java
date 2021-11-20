package day18_nestedForLoop_whileDo;

public class Q02_KitSayi {
	public static void main(String[] args) {
		
	/*	N pozitif bir tamsay� olmak �zere, N say�n�n pozitif b�lenleri toplam� (n)�dir.(n) < 2N ise N say�s� k�t say�d�r. 

		�rne�in;

		10 say�s�n� d���nelim. Bu say�n�n b�lenleri: 1, 2, 5 ve 10.

		(n) = 1+2+5+10 = 18

		2n = 2*10 = 20

		(n) > 2n oldu�u i�in 10 say�s�, k�t say� �zelli�ini ta��r.   */

	int toplam=0;
    
    for(int i=10;i<50;i++){
        for(int j=1;j<=i;j++){
            
            if(i % j == 0){
                toplam+=j;                  
            }               
            
        }

        if(toplam < (i*2)){
            System.out.println(i+" Say�s� Bir K�t Say�d�r.");
        }
        
        toplam=0;
    }
}

}
package day18_nestedForLoop_whileDo;

public class Q13_MukemmelSayilar {

	public static void main(String[] args) {
		/*
		 * Kendisi hari� b�t�n pozitif b�lenlerinin toplam�, kendisine e�it olan
		 * say�lara m�kemmel say�lar denir. �rne�in;
		 * 
		 * 6 say�s�n�n b�lenleri: 1 + 2 + 3 = 6
		 * 
		 * 28 say�s�n�n b�lenleri: 1 + 2 + 4 + 7 + 14 = 28
		 * 
		 * 
		 * 
		 * 
		 * �imdi 1 ile 1000 aras�ndaki m�kemmel say�lar� bul
		 */
		int toplam=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<i;j++){
                
                if(i%j==0){
                    
                    toplam=toplam+j;
                }
                
                }
            if(toplam==i){
                
                System.out.println(i+ " Say�s� Bir M�kemmel Say�d�r.");
            }
            toplam=0;
            
            
        }
        
        
        
        
    }

}

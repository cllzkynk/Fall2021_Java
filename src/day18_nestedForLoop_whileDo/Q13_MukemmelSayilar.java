package day18_nestedForLoop_whileDo;

public class Q13_MukemmelSayilar {

	public static void main(String[] args) {
		/*
		 * Kendisi hariç bütün pozitif bölenlerinin toplamý, kendisine eþit olan
		 * sayýlara mükemmel sayýlar denir. Örneðin;
		 * 
		 * 6 sayýsýnýn bölenleri: 1 + 2 + 3 = 6
		 * 
		 * 28 sayýsýnýn bölenleri: 1 + 2 + 4 + 7 + 14 = 28
		 * 
		 * 
		 * 
		 * 
		 * Þimdi 1 ile 1000 arasýndaki mükemmel sayýlarý bul
		 */
		int toplam=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<i;j++){
                
                if(i%j==0){
                    
                    toplam=toplam+j;
                }
                
                }
            if(toplam==i){
                
                System.out.println(i+ " Sayýsý Bir Mükemmel Sayýdýr.");
            }
            toplam=0;
            
            
        }
        
        
        
        
    }

}

package day23_multiDimensionalArrays;

public class Q01ArrayinElementleriIleIslemler {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana 
		//yazdiran bir method yaziniz.
		
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		int carpim=1;
		int toplam=0;
		String conct="";
		/*==================CARPIM==============*/
		for (int i = 0; i < arr1.length; i++) {
			carpim*=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			carpim*=arr2[i];
		}
		
		System.out.println("Iki arrayin tum elementleri carpimi :"+carpim);
		
		/*==================TOPLAM==============*/
		
		for (int i = 0; i < arr1.length; i++) {
			toplam+=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			toplam+=arr2[i];
		}
		
		System.out.println("Iki arrayin tum elementleri toplami :"+toplam);
		
		/*==================CONCATI==============*/
		for (int i = 0; i < arr1.length; i++) {
			conct+=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			conct+=arr2[i];
		}
		
		System.out.println("Iki arrayin tum elementleri concati :"+conct);
	}

}

package day23_multiDimensionalArrays;



public class C03_MultiDimensionalArrays {
	static int arr[][] = { { 1, 2 }, { 4, 5, 6, 7 },{3 ,0}};

	public static void main(String[] args) {
		// Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
		// ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }		
		
	carpim(arr);
	topla(arr);
	bir(arr);
	}
	public static void carpim(int[][] arr2) {
		int carpim = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				carpim *= arr[i][j];
			}
		}
		System.out.println("Tum elementler carpimi "+carpim);
	}
	public static void topla(int[][] arr2) {
		int topla = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				topla += arr[i][j];
			}
		}
		System.out.println("Tum elementler toplami "+topla);
	}
	public static void bir(int[][] arr2) {
		String arrr="";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrr+= arr[i][j]+"-";
			}
		}
		System.out.println("Tum elementler concati "+arrr);
	}


}

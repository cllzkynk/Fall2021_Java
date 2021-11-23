package day21_scope_arrays;

import java.util.Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		String arr[]= new String[4]; // ya bu sekilde new  keywordu ile mutlaka turunu ve  newden sonra gene tur ve [] seklinde uzunlugu belirt
arr[0]="Ali";
arr[1]="Veli";
arr[2]="Ayse";
arr[3]="Fatma";
System.out.println(Arrays.toString(arr));// yazdirirken yardim aldigimiz metod
String arr2[]= {"Ali" , "Veli" ,"Ayse", "Fatma"}; // yada bele dumduk yaz 

arr2[0]="Can";
arr2[2]="Gul";

System.out.println(arr2[1]);
System.out.println(Arrays.toString(arr2));
System.out.println(arr2[arr2.length-1]);
	}

}

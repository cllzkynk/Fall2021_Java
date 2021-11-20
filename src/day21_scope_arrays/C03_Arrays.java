package day21_scope_arrays;

import java.util.Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		String arr[]= new String[4];
arr[0]="Ali";
arr[1]="Veli";
arr[2]="Ayse";
arr[3]="Fatma";
System.out.println(Arrays.toString(arr));
String arr2[]= {"Ali" , "Veli" ,"Ayse", "Fatma"};

arr2[0]="Can";
arr2[2]="Gul";

System.out.println(arr2[1]);
System.out.println(Arrays.toString(arr2));
System.out.println(arr2[arr2.length-1]);
	}

}

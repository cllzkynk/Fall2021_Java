package day21_scope_arrays;

import java.util.Arrays;

public class C06_ArraysShort {

	public static void main(String[] args) {
		int arr[] = { 10, 15, 2, 45, 78 };
		Arrays.sort(arr);
		System.err.println(Arrays.toString(arr));
		
		for (int i =arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		} 
		System.out.println();
		int arr2[] = { 0, 0, 0, 0, 0 };
		for (int i =arr.length-1; i >=0; i--) {
			arr2[arr.length-i-1]=arr[i];
		} 
		System.out.println(Arrays.toString(arr2));
		

	}

}

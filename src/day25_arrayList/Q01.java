/**
 * 
 */
package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author CELÝL
 *
 */
public class Q01 {

	public static void main(String[] args) {
		// 1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana
		// yazdiriniz.

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		System.out.println(list);
		
		
		//topluca da ekleme yapilabilir
		List<String> list2 = new ArrayList<>();

		list2.addAll(Arrays.asList("A","C","E","F"));
		System.out.println(list2);
		list2.add("G");
		System.out.println(list2);
		
	}

}

/**
 * 
 */
package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author CELÝL
 */
public class Q07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
		 */
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");

		list.add("B");

		list.add(1, "L");

		
		list.set(3,"D");
		list.remove(4);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.contains("L"));
		System.out.println(list.size());
	}

}

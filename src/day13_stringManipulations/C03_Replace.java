package day13_stringManipulations;

public class C03_Replace {
	public static void main(String[] args) {
		String str="Java ogrenmek cok zevkli";
		System.out.println("Orijinal kelime : "+str);
		System.out.println(str.replace(" " , ""));
		System.out.println(str.replace("ogrenmek", "kod yazmak"));
		System.out.println(str.replace("Java", "kod"));
	    System.out.println(str.replace("e", "a"));
	    
		
		System.out.println(str.repeat(2));  // yaziyi parantez ici kadar tekrar tekrar yazdirir
		
	
	}

}

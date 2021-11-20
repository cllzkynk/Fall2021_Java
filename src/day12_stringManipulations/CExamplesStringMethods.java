package day12_stringManipulations;

public class CExamplesStringMethods {

	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
		System.out.println("=================length()==================");
		
		// create a string
	    String str= "Hello! World";
	    String str2="Yasasin Ozgurluk";
	  //  System.out.println("String length: " + str);

	    // get the length of greet
	    int length = str.length();
	   
	   // System.out.println("Length: " + length); 
	    System.out.println("=================join()==================");
	    System.out.println(String.join(str, str2));
	    
	    String degisim=String.join(str2,str);
           
	    		System.out.println(degisim);
	    		
	    		System.out.println(str.join(str, "vak vak"));
	    		
	    		
	    		System.out.println("=================concat()==================");
	    System.out.println(str);
	 // create first string
	    String first = "Java ";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    
	
		System.out.println("=================trim()==================");
		
		String celil="Alcaklara kar yagmis";
		String celal="            Toplumu bir                                        kere isci ve yonetici diye ayirdin mi sinif kavgalari baslamis demektir     ";
		System.out.println(celal);
		System.out.println(celal.trim());// sadece basta ve sondaki bosluklari trimler
		
		
		
		System.out.println("=================concat()==================");
		
		String mahmut="Toplumlarda en buyuk sacas sebebleri temelde iki turludur. Biri din biri ekonomidir";
		String armut="Vatan sana adil olan yerdir";
		
		char[] chartoarray=mahmut.toCharArray();
		System.out.println(chartoarray);
	System.out.println(mahmut.length());
	System.out.println(chartoarray.length);
		
 

		
		
		System.out.println("=================soru==================");
		
		System.out.println("soru baslasin");
	     int a=25;
         if(a>10)
             System.out.print("ok");
         else if(true)
             System.out.print("bye");
		
     	System.out.println("\nsoru bitsin");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	} // main sonu

} // class sonu

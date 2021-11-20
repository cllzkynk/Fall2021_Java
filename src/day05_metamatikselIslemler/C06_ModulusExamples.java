package day05_metamatikselIslemler;

public class C06_ModulusExamples {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Example 1 - Modulo operator returns remainder
		int iValue = 101; 
		double dValue = 39.02; 
		System.out.println(iValue + " mod 9 = " + iValue % 9); 
		System.out.println(dValue + " mod 9 = " + dValue % 9); 
		// Example 2 - module operator on 10 can give you last digit of integer number 
		int number = 215; 
		int total = 349; 
		System.out.printf("Last digit of %d  is %d%n", number, number % 10);
		System.out.printf("Last digit of %d is %d%n", total, total % 10); 
		
		
		
		int num1,num2,result1;
		num1=26;
		num2=15;
		System.out.println("num1=26; num2=15");
		result1=num1%num2;
		System.out.println("The result after modulus operation is : "+result1);
		
		
		int result2 = 23 % 6;

        System.out.println("result = " + result2);
        
        
        
        int x = 3;
        int z = 10;
        int y = -23;        
        int w = -12;
        double d = 2.15;
        float f= 3.6f;
        int zero=0;
         
        //positive number modulus positive number
        //the result is the remainder of the division 
        System.out.println("positive number modulus positive int number: "+z % x);
         
        System.out.println("positive number modulus positive double number: "+z % d);
         
        System.out.println("positive number modulus positive float number: "+z % f);
         
        //negative number modulus positive number
        //the result is negative
        System.out.println("negative number modulus positive number: "+ y % z);
         
        //negative number modulus negative number
        //the result is the negative remainder of the division 
        System.out.println("negative number modulus negative number: "+w % y);
         
        //zero number modulus  number
        //the result is zero
        System.out.println("zero modulus number : "+zero % z);
         
        // number modulus zero
        //throws java.lang.ArithmeticException , it must surround with try catch brackets
        //in order to avoid crush the execution

        
        int num22,num23,result33;
		num1=13;
		num2=8;
		System.out.println("num1=13; num2=8");
		result33=num1%num2;
		System.out.println("The result after modulus operation is : "+result33);
		
	
	}

}

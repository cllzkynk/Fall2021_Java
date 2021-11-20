package day05_metamatikselIslemler;

public class C07_ModulesExamples {
	
	public static void main(String[] args) {
		
	
	int a=5  ;
	int i;
    i=(++a) + (++a) + (a++);//i=(6)+(7)+(7)=20
    System.out.println("1. i deger"+i);
    i=(a++) + (++a) + (++a);//i=(8)+(10)+(11)=29
    System.out.println("2. i deger"+i);
    a=(++a) + (++a) + (a++);//a=(12)+(13)+(13)=38
    
    System.out.println("a nin degeri "+ a);    
    
    System.out.println(++a);    //39
    
    System.out.println(a++);  //39
    System.out.println(a);    //40
    

	} 
}

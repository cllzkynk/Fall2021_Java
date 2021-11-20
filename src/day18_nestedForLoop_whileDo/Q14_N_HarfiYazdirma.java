package day18_nestedForLoop_whileDo;

public class Q14_N_HarfiYazdirma {

	public static void main(String[] args) {
	        for(int i=0;i<7;i++){
        for(int j=0;j<7;j++){
            
        	if (i!=0 &&j==i) {
        		 System.out.print(" * ");
			}else
             if((j==0 || j==6) ){
                System.out.print(" * ");
            }else{ 
                System.out.print("   ");
            }
        }
System.out.println();
    }	        	        
}
}



/*


*       * 
* *     * 
*  *    * 
*   *   * 
*    *  * 
*     * * 
*       *  
*/
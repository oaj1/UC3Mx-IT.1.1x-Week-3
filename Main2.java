/**
 * Do not change the method or class
 * declarations.
 */

public class Main2{

    /*
     * Returns an array with the quotient and remainder of the
     * integer division
     *
     * @param dividend a positive int
     * @param divisor a positive int
     */
    static int[] division(int dividend, int divisor){

	    int result[] = {0, dividend}; // array named result. element [0] == 0, element [1] == divident paramater
	
	    if ( dividend < divisor ){
	        return result; 
           
           /* 
           
           1.)now comes the recursive portion of method
           2.)for every iteration subtract divisor from the dividend
           3.)call the method again, REPEAT until dividend < divisor
           4.) update result[0], which would be the quotient, or the multiple, on each iteration
                  i.e. 10, 5 the quotient would be 2
           5.) since we are trying to find the quotient, each iteration should update result[0]
           
           */
	    }else{
            // each iteration subtract divisor from the dividend
            // ex) dividend=8, divisor=2: 8->6->4->2 (4 iterations)
            int temp = dividend - divisor;    
            
            //make result(dividend, divisor), now take the new values (temp, visor)
            //call the method again, this way the dividend keeps getting closer to base case (recursion)
            result = division(temp, divisor);
            
            //update result[0]
            result[0]++;
	    
           //return the result
	        return result;
	    }
	
    }
    /* 
    integer array result calls division method
    division method returns the quotient and remainder of the aruguements
    
    */

    public static void main(String[] args){
	    int result[]=division(4,2);
	    System.out.println("Quotient: "+ result[0]
			   + " Remainder: "+ result[1]);
    }
}
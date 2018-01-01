/**
 * Do not change the method or class
 * declarations.
 */

public class Main{

    static int factorial(int number){
        if (number <= 1){
            
            return 1;
        }else{

	    System.out.println("At factorial("+number+")");
	
	    return number * factorial(number-1);}
    }
    
    public static void main(String[] args){
	
	    System.out.println(factorial(4));
    }
}


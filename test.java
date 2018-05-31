package test;
import java.lang.*;
public class HelloWorld { 
    public static void main (String[] args) {
        private int i;
		int score[6] = { 76, 82, 90, 86, 79, 62 } ;
		float sum, mean = 0;
		
		sum = 0;		

		for ( i = 0 ; i < 6 ; i++ ){
        	sum = sum + score[i];
        }

        if ( mean >= 60 ) {
        	mean = mean - 60 ;
        	
   	 	}

    	else {
        	mean = 60 - mean ;        	
        }
    	
		System.out.println(sum); 
	} 
}
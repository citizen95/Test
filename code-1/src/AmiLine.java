import java.util.Scanner;

public class AmiLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n=0; 
		int m=1;
		int l=0;
				
		System.out.print("input :");
		String word = input.next();
		
		
		char[] Array = word.toCharArray();
		char[] Array1 = new char[100];
		int[] Array2 = new int[100];
	    	 
	    
	    if(Array[0]=='D') {
	    for(int a = 0; a<Array.length; a++) {	    	
	    	Array1[a]=Array[a];
	    	if(Array[0] == 'D' ) {	    		 	    		 
		     	  Array1[0] = 'S';
	    	 }
	    	
	    	if(Array[a] == '1') {
	    		n++;
	    		
	    		if(n%2==0)
	    		  Array1[a] = '-';
	    		else
	    			Array1[a] = '+';
	    	}	
	    		    		    	
	    	
	    }
	
	    
	    for(int b=0; b<Array.length; b++) {
	    	if(Array[b]=='0') {
	    		Array2[b]=m;
	    		m++;
	    	}
	    	else {
	    		m=0;
	    		Array2[b]=m;
	    		m++;
	    	}
	    	
	    }
	    
	    for(int c=0; c<Array.length; c++ ) {
	    	if(Array[c]=='1') {
	    		l++;
	    	}	    		
	    	if(Array2[c]==4) 	{		
  	    		Array1[c] = '+';
  	    		if(l%2==0)
  	    			Array1[c]= '-';
	    	}
	    	    				
    		
	    	if(Array2[c]==5) {  		
	  	    	Array1[c] = '-';
	  	    	if(l%2==0)
  	    			Array1[c]= '+';	  	    	
	    	}
	    	
	    	if(Array2[c]==0 && Array2[c]>4)
    			Array1[c-1]='0';
	    			    		
	    	
	    	if(Array2[c]==7) { 			
  	    		Array1[c] = '-';
  	    		if(l%2==0)
  	    			Array1[c]= '+';	
	    	}  	    
    				
    		if(Array2[c]==0 && Array2[c]>6) {
    			Array1[c-3]='0';
    			Array1[c-2]='0';
    		}    			    		
	    		
	    		
    		if(Array2[c]==8) {	    			    	
	  	    	Array1[c] = '+';
	  	    	if(l%2==0)
  	    			Array1[c]= '-';	
	    	}	  	      			
	    				
    		if(Array2[c]==0 && Array2[c]>7 ) {
    			Array1[c-1]='0';
    			Array1[c-4]='0';
    			Array1[c-3]='0';
    		}
	    	}
	    }
	    
	    
	    
	    if(Array[0] == 'S' ) {
	    	for(int a = 0; a<Array.length; a++) {	    	
		    	Array1[a]=Array[a];
		    	if(Array[0] == 'S' ) {	    		 	    		 
			     	  Array1[0] = 'D';
		    	 }
		    	
		    	if(Array[a]=='+' || Array[a]=='-')
		    		Array1[a]= '1';
		    		
	    	
	    	
	    	}
	    	
	    	for(int b=0; b<Array.length; b++) {
	    		if(Array[b]=='+' && n<=1) {
		    		l++;
		    		if(l==2) {
		    			n=0;
		    			Array1[b]='0';
			    		Array1[b+1]='0';
			    		Array1[b+3]='0';
			    		Array1[b+4]='0';
		    		}
		    			
		    		}
		    	if(Array[b]=='-' && l<=1) {
		    		n++;
		    		if(n==2) {
		    			l=0;
		    			Array1[b]='0';
			    		Array1[b+1]='0';
			    		Array1[b+3]='0';
			    		Array1[b+4]='0';
		    		}
		    					    		
		    	}


	    	}
	    	
	    }   			    		    			    	    		    	
	    		    	    	    	    					    	
	    System.out.print("output : ");   	    	
		for(int j = 0; j<Array.length; j++) {
		    System.out.print( Array1[j]);
		}
		
	    
	    
		input.close();
		
	
			
		

	}
}




package Excepciones;

public class PropiaClaseException {

	public static void main(String[] args) {
	  
	    
	    
	    try {
	    	throw new MiException("Exception");
	    	
	    }
	    
	    
	    catch(MiException e){
	    	
	    	System.out.println("Exception"+e);
	    }	
	    
	    
	}

}

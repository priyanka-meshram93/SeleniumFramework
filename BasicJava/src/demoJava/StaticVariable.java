package demoJava;

public class StaticVariable {
	
	
	static int var= 16;       //static area
	
	static int bv= 34;
	
	public static void main(String[] args) {
		
		System.out.println(StaticVariable.var);       //static area
		System.out.println(StaticVariable.bv);
		
		
	}
	
	  void m3() {
	    	
	    	System.out.println(var);
	    	System.out.println(bv);
	    	
	    	
	    	
	    }
	  
	  static void m4() {
		  
		  
		  
	  }
	
	
	
		


}

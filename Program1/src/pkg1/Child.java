package pkg1;

public class Child extends Parent {
	
	public Child() {
		
		this(1,2);
		System.out.println("Child default constructor");
	}
	
       public Child(int a) {
		
    	this(1,2,3);   
		System.out.println("Child one parameterized constructor");
	}
       
       public Child(int a, int b) {
   		
    	super(1);  
   		System.out.println("Child two parameterized constructor");
   	}
       
       public Child(int a, int b, int c) {
    	   
   		this();
   		System.out.println("Child three parameterized constructor");
   	}
       
       public static void main(String[] args) {
    	   
    	   Child ref= new Child(1);
		
	}

}

package pkg1;

public class ClassAParent {
	
	public ClassAParent() {
		
		this(3,4);
		System.out.println("Parent default constructor");	
	}
	
        public ClassAParent(int a) {
		
        this();	
		System.out.println("Parent one parameterized constructor");	
		
    }
        
        public ClassAParent(int a, int b) {
    		
    		System.out.println("Parent two parameterized constructor");	
    		
        }


	
}


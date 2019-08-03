package pkg1;

public class ClassBChild extends ClassAParent {
	
public ClassBChild() {
		
	    this(1);
		System.out.println("Child default constructor");	
	}
	
        public ClassBChild(int a) {
		
        super(2);
		System.out.println("Child one parameterized constructor");	
		
    }
        
        public ClassBChild(int a, int b) {
    		
        	this();
    		System.out.println("Child two parameterized constructor");	
    		
        }
        
        public static void main(String[] args) {
			
        	ClassBChild ref= new ClassBChild(1,2);
		}
        	

}

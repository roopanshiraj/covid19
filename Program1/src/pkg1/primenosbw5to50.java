package pkg1;


public class primenosbw5to50 {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Prime nos. between 5 to 50 are");
		
		
		for(int n=5;n<=50;n++){

			//boolean isPrime=true;//
			
			int count=0;
			
			
			for(int i=2;i<=n/2;i++){

               
               if(n%i==0){
            	   
		//	   isPrime= false;
			   
			   count=1;
			   break;

			  }

			  }


			//	if(isPrime){//
				
				if(count==0) {

			System.out.print (+n+" ,");
			}
			
		}
	}
}
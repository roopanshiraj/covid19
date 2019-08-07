package pkg1;

public class primeno5to50 {
	
	public static void main(String[] args) {
		
		int low=5, high=50;
		
		while (low<high)
		{
			boolean flag= false;
			
			for(int i=2; i<=low/2; i++)  // condition for non-prime no
			{
				if (low % i==0)
				{
					flag= true;
					break;
				}
			}
			
			if (!flag)
				System.out.println(low + "");
			
			low++;
		}
	}

}

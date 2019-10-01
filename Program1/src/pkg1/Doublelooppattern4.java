package pkg1;

public class Doublelooppattern4 {
	
public static void main(String[] args) {
	
		int a=0;
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				a= a+1;
				System.out.print(a+ " ");
			}
			System.out.println();
		}
			
	}
	}
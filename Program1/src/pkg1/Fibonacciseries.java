package pkg1;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		int n=12, t1=0, t2=1, sum;
		System.out.println("Fibonacci series of" +n + "numbers");
		for (int i=1; i<=n; i++)
		{
			System.out.println(t1+"+");
			sum= t1+t2;
			t1=t2;
			t2=sum;
		}
	}

}

package testnew;

public class secondprogram {

	public static void main(String[] args) {
		secondprogram obj = new secondprogram();
		int resultsum=obj.sum(10, 2);
		int resultsub=obj.sub(resultsum, 2);
		int resultsum1=obj.sum(resultsub,2);
		int multiresult=obj.multi(resultsum1,2);
		obj.div(multiresult, 2);
	}
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of sum "+ c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c= a-b;
		System.out.println("Result of sub "+ c);
		return c;
	}
	public int multi(int a, int b)
	{
		int e;
		e=a*b;
		System.out.println("Result of sub "+ e);
		return e;
	}
	public void div(int a, int b)
	{
		int result;
		result =a/b;
		System.out.println("result is "+ result);
	}
}

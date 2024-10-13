package testnew;

public class thirdprogram {

	public static void main(String[] args) {
		thirdprogram objthird= new thirdprogram();
		int resultmulti = objthird.multi(10, 2);
		int resultsub = objthird.sub(resultmulti, 2);
		int resultsub1 =objthird.sub(resultsub, 2);
		int resultsum =objthird.sum(resultsub1, 2);
		objthird.div(resultsum, 2);
	

	}
	public int multi(int a, int b)
	{
		int e;
		e=a*b;
		System.out.println("Result of mult "+ e);
		return e;
	}
	
	public int sub(int a, int b)
	{
		int c;
		c= a-b;
		System.out.println("Result of sub "+ c);
		return c;
	}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of sum "+ c);
		return c;
	}
	public void div(int a, int b)
	{
		int result;
		result =a/b;
		System.out.println("result is "+ result);
	}

}

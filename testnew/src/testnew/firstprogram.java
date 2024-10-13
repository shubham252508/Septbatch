package testnew;

public class firstprogram {

	public static void main(String[] args) {
	
		firstprogram s = new firstprogram();
		int sumresult =s.sum(10,2);
		int subresult=s.sub(10,2);
		s.multi(sumresult, subresult);
		
	}
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		return c;
	}
	public int sub(int a, int b)
	{
		int d;
		d=a-b;
		System.out.println(d);
	return d;
	}
	public void  multi(int a, int b)
	{
		int result;
		result =a*b;
		System.out.println("final result "+ result);
	}

}

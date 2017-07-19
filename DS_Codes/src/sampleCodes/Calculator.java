package sampleCodes;

public class Calculator implements calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c= new Calculator();
		int a=10, b=10;
		System.out.println("ADD:"+c.add(a, b));
		System.out.println("SUB:"+c.sub(a, b));
		System.out.println("SUB:"+c.mul(a, b));
		
	}
	public int add(int a,int b)
	{
	return(a+b);
	}
	public int sub(int a,int b)
	{
	return(a-b);
	}
	public int mul(int a,int b)
	{
	return(a*b);
	}

}

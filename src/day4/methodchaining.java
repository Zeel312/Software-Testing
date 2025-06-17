package day4;

public class methodchaining {
	public static void main(String[] args) {
		methodchaining obj = new methodchaining();
		obj.div();
		obj.addition();
	}
	void addition()
	{
		int a=1 , b=2;
		int c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a=1 , b=2;
		int c=a-b;
		System.out.println(c);
	}
	void multiplication()
	{
		int a=1 , b=2;
		int c=a*b;
		System.out.println(c);
	}
	void div()
	{
		int a=1 , b=2;
		int c=a/b;
		System.out.println(c);
	}
}

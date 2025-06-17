package day12;


	abstract class P
	{
		abstract void Add();
	}

	
public class Abstract1 extends P {
	public static void main(String[] args) {
		Abstract1 obj = new Abstract1();
		obj.Add();
	}

	@Override
	void Add() {
		int a = 10 , b = 20;
		int c = a+b;
		System.out.println(c);
		
	}
}
	
		
	


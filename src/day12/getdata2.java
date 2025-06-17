package day12;

public class getdata2 implements I {

	@Override
	public void Add() {
		System.out.println("Interface");
		
	}

	@Override
	public void sub() {
		System.out.println("IIIIII");
		
	}
public static void main(String[] args) {
	getdata2 abc = new getdata2();
	abc.Add();
	abc.sub();
}
}

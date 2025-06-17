package day12;

public class getdata extends P {

	@Override
	void Add() {
	int a = 10, b = 20 , c = 90;
	int d = (a+b+c)/3;
	System.out.println(d);
	}
public static void main(String[] args) {
	getdata obj = new getdata();
	obj.Add();
}
}

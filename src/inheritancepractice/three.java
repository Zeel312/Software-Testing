package inheritancepractice;
class GP{
	int a = 10, b=90;
}
class g extends GP
{
	void data1()
	{
		System.out.println(a>b);
	}
}
class z extends g
{
	void data2()
	{
		System.out.println(a<b);
	}
}

public class three {
	public static void main(String[] args) {
	z obj  = new z();
	obj.data2();
	g obj1 = new g();
	obj1.data1();


	}

}

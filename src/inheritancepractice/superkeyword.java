package inheritancepractice;

class g1
{
	void A()
	{
		System.out.println("parent");
	}
}
class z1 extends g1
{
	void A()
	{
		super.A();
		System.out.println("child");
	}
}

public class superkeyword {
	public static void main(String[] args) {
		z1 obj = new z1();
		obj.A();
	}

}

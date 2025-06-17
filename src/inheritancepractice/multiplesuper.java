package inheritancepractice;

class x
{
	void A()
	{
		System.out.println("G parent");
	}
}
class y extends x
{
	void A()
	{
		super.A();
		System.out.println("Parent");
	}
}

class s extends y
{
	void A()
	{
		super.A();
		System.out.println("Child");
	}
}

public class multiplesuper {
	public static void main(String[] args) {
		s obj = new s();
		obj.A();
	}

}

package day13;

class p
{
	void demo()
	{
		System.out.println("demo 1");
	}
}
public class upcasting extends p {
	void demo2()
	{
		System.out.println("demo 2");
	}
	public static void main(String[] args) {
		upcasting obj = new upcasting();
	}

}

package day11;

class p 
{
	int a=10;
}
class c extends p
{
	void data()
	{
		System.out.println(a);
	}
}
public class getdata {
	public static void main(String[] args) {
		c obj = new c();
		obj.data();
	}

}

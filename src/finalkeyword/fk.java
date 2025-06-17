package finalkeyword;

public class fk {
	public class finalkeyword {
		public static void main(String[] args) {
	//can't change the value
			final int age = 21;
			age = 30;
	//can't use same method
	class A
	{
		final void data()
		{
			System.out.println("hello");
		}
	}
	class B extends A
	{
		void data()
		{
			System.out.println("hii");
		}
	}
	//can't extends a class
	final class p
	{
		
	}
	class c extends p
	{
		
	}
		
	}
	}

}

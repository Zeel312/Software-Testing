package day13;

class Animal
{
	void EAT()
	{
		System.out.println("animal is eating");
	}
}

public class child extends Animal{
	void EAT()
	{
		System.out.println("Dog is eating");
	}
	public static void main(String[] args) {
		Animal obj = new child();
		obj.EAT();
	}
}

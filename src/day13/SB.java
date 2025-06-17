package day13;

//ststic binding

public class SB {
	private void Animal()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		SB obj = new SB();
		obj.Animal();
	}

}

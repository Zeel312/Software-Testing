package day13;

public class TryFinally {
	public static void main(String[] args) {
		try //code that may throw an exception
		{
			System.out.println("Inside try block");
			int result = 10/0;
		}
		finally //code that will always execute
		// if there is no error , if there is an error , even if there is a return statement
		{
			int a = 1, b=5;
			int c = a+b;
			System.out.println(c);
			System.out.println("Inside finally block");
			}
		}
	}



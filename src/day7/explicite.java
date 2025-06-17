package day7;

public class explicite {
	public static void main(String[] args) {
		int a1=19, b=3;
		double c = (double) a1/b;
		System.out.println(c);
		
		String x = "80";
		int x1 = Integer.parseInt(x); //string to int
		int add = x1+10;
		System.out.println(add);
		
		int b1 = 10;
		String conv = String.valueOf(b1); // int to String
		System.out.println(conv.concat("is a value"));
		
	}
	
	
	
	
	

}

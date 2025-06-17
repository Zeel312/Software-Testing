package Day6;

public class A {
	public static void main(String[] args) {
		int a=5;
		a= --a;
		System.out.println(a);
		
		int b=5;
		b = ++b + b++;
		System.out.println(b);
		
		int c=8;
		c = c-- - ++c + c++;
		System.out.println(c);
		
		int d=13;
		d = ++d + d++ + d++;
		System.out.println(d);
		
	}

}

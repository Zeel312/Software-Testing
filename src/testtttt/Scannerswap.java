package testtttt;

import java.util.Scanner;

public class Scannerswap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a data");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swap");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap");
		System.out.println("a:"+a);
		System.out.println("b: "+b);
		
	}

}


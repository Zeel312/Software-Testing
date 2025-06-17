package day5;

public class forloopexample {
	public static void main(String[] args) {
		printnumbers1to5();
		printevennumbers();
		printhellothreetimes();
		printstarsinline();
		printcountingfrom3to7();
	}
// 1. print numbers from 1 to 5
public static void printnumbers1to5() {
	System.out.println("Numbers from 1 to 5:");
	for (int i=1; i<=5; i++) {
		System.out.println(i);
	}
}
//2. print even numbers from 1 to 10
public static void printevennumbers() {
	System.out.println("even numbers from 1 to 10:");
	for (int i=2; i<=10; i+=2) {
		System.out.println("i");
	}
}
//3. print 5 stars in one line
public static void printhellothreetimes() {
	System.out.println("printing 'hello' 3 times:");
	for (int i=1; i<=3; i++) {
		System.out.println("Hello");
	}
}
//4. print 5 stars in one line
public static void printstarsinline() {
	System.out.println("stars in one line: ");
	for (int i=1; i<=5; i++) {
		System.out.println("*");
	}
}

//5. print numbers from 3 to 7
public static void printcountingfrom3to7() {
	System.out.println("numbers from 3 to 7: ");
	for (int i=3; i<=7; i++) {
		System.out.println("i");
	}
}
}

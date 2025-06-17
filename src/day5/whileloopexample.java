package day5;

public class whileloopexample {
public static void main(String[] args) {
	printnumbers1to5();
	printevennumbers1to10();
	printhellothreetimes();
	printstarsinline();
	printnumbersfrom3to7();
}
//1. print numbers from 1 to 5
public static void printnumbers1to5() {
	int i=1;
	System.out.println("Numbers from 1 to 5:");
	while (i<=5) {
		System.out.println(i);
		i++;
	}
}
//2. print even numbers from 1 to 10
public static void printevennumbers1to10() {
	int i=2;
	System.out.println("even numbers from 1 to 10:");
	while (i<=10) {
		System.out.println(i);
		i+=2;
	}
}
//3. print hello three times
public static void printhellothreetimes() {
	int i=1;
	System.out.println("printing hello 3 times:");
	while (i<=3) {
		System.out.println("Hello");
		i++;
	}
}
//4. printing 5 stars in one line
public static void printstarsinline() {
	int i=1;
	System.out.println("printing stars in one line:");
	while (i<=5) {
		System.out.println("*");
		i++;
	} 
	System.out.println();
	}
//5. print numbers from 3 to 7
public static void printnumbersfrom3to7() {
	int i=3;
	System.out.println("numbers from 3 to 7:");
	while (i<=7) {
		System.out.println("i");
		i++;
	} 
 }
}

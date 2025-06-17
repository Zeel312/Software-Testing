package day5;

public class ifelsestatement {
public static void main(String[] args) {
	checkpositivenegative(5);
	checkevenodd(10);
	checkvotingeligibility(17);
	comparetwonumbers(15,20);
}
//1. check if number is positive or negative
public static void checkpositivenegative(int num) {
	if (num >= 0) {
		System.out.println(num + " is positive"); }
	else {
		System.out.println(num + "  is negative"); 
	}
}
//2. check if number is even or odd
public static void checkevenodd(int num) {
	if (num %2 == 0) {
		System.out.println(num + " is even");
	} else {
		System.out.println(num + " is odd");
	}
}
//3. check if person is eligible to vote
public static void checkvotingeligibility(int age) {
	if (age >= 18) {
		System.out.println("Eligible to vote");
	} else {
		System.out.println("Not eligible to vote");
	}
}
//4. compare two numbers
public static void comparetwonumbers(int a, int b) {
	if (a > b) {
		System.out.println(a + " is greater than "  + b);
	} else if (a < b) {
		System.out.println(a + " is less than " + b);
	} else {
		System.out.println(a + " is equal to " + b);
	}
}
}

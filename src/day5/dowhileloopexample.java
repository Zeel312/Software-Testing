package day5;

public class dowhileloopexample {
	public static void main(String[] args) {
		printnumbers1to5();
		printevennumbers1to10();
		printhellothreetimes();
		printstarsinline();
		printnumbersfrom3to7();
	}
//1.print numbers from 1 to 5
	public static void printnumbers1to5() {
		int i=1;
		System.out.println("Numbers from 1 to 5:");
		do {
			System.out.println(i);
			i++;
		} while (i<=5);
	}
//2. print even numbers from 1 to 10
		public static void printevennumbers1to10() {
			int i=2;
			System.out.println("even numbers from 1 to 10:");
			do {
				System.out.println(i);
				i+=2;
			} while (i<=10);
		}
//3. print hello 3 times
		public static void printhellothreetimes() {
			int i=1;
			System.out.println("printimh hello 3 times:");
			do {
				System.out.println("hello");
				i++;
			} while (i<=3);
		}
//4. print 5 stars in one line
		public static void printstarsinline() {
			int i=1;
			System.out.println("star in one line:");
			do {
				System.out.println("*");
				i++;
			} while (i<=5);
			System.out.println();
		}
//5. print numbers from 3 to 7
		public static void printnumbersfrom3to7() {
			int i=3;
			System.out.println("numbers from 3 to 7:");
			do {
				System.out.println("i");
				i++;
			} while (i<=7);
		}
}

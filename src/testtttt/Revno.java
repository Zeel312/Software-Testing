package testtttt;

public class Revno {
    public static void main(String[] args) {
        int number = 873427;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // Get the last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed
            number /= 10;                 // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
    }

		}
	


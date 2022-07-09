import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year in YYYY format: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int count = 0;
		int rev = year;
		while (year != 0) {
			year = year / 10;
			++count;
		}
		if (count == 4) {
			if (((rev % 4 == 0) && (rev % 100 != 0) || (rev % 400 == 0)))
				System.out.println("Specified year is a leap year.");
			else
				System.out.println("Specified year is not a leap year.");
		} else {
			System.out.println("Error! Please enter the year in YYYY format.");
		}
	}

}

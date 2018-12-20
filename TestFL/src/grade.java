import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// So, really this is just a test to see if this syncs up to my desktop.
		// One of the things I'm actually kinda looking forward to is to see if at
		// school,
		// this will sync with my onedrive. If so, I'm probably going to have to install
		// a new eclipse on the school computer.
		// I might run it off a flash drive, We'll see. Anyway, back to making a
		// program.

		int[] tests = new int[50];
		int grade;
		int gradeCounter = 1;
		int counter = 0;

		System.out.println("Enter up to 50 grades");
		Scanner in = new Scanner(System.in);
		System.out.printf("Grade %d: ", gradeCounter);
		grade = in.nextInt();

		while (grade != -1) {
			tests[counter] = grade;
			counter++;
			System.out.printf("Grade %d: ", ++gradeCounter);
			grade = in.nextInt();
		}
		in.close();
		if (counter == 0) {
			System.out.println("You did not enter any grades. The program will now terminate.");
			System.exit(0);
		}
		System.out.println("The number of grades entered: " + counter);
		int min = tests[0];
		int max = tests[0];

		for (int i = 0; i < counter; i++) {
			if (tests[i] < min) {
				min = tests[i];
			}
		}
		System.out.println("The lowest grade entered: " + min);

		for (int i = 0; i < tests.length; i++) {
			if (tests[i] > max) {
				max = tests[i];
			}
		}
		System.out.println("The largest grade entered: " + max);
		double sum = 0;

		for (int i : tests) {
			sum += i;
		}
		double average = sum / counter;
		System.out.println("The average of the grades: " + average);

		System.out.print("The grades entered: ");
		// if (tests.length >= 1) {
		System.out.print(tests[0]);
		// }
		for (int i = 1; i < counter; i++) {
			System.out.print(", " + tests[i]);
		}

	}

}

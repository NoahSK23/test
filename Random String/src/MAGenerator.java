import java.util.Random;
import java.util.Scanner;

public class MAGenerator {

	public static void main(String[] args) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String randomString = "";
		int length = 16;
		int counter = 0;
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		char[] code = new char[length];
		System.out.println("Movies Anywhere Code Generator -------------------------------------");
		System.out.println("How many times do you wish to loop?");
		int whileVar = in.nextInt();

		while (counter < whileVar) {
			for (int i = 0; i < length; i++) {
				code[i] = characters.charAt(rand.nextInt(characters.length()));
			}
			for (int i = 0; i < code.length; i++) {
				randomString += code[i];
			}
			System.out.println(randomString);
			randomString = "";
			counter++;
		}
		System.out.println("Done.");
		in.close();
	}
}

/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 19th, 2021
 * Modified: Nov 19th, 2021
 * Description: This class will prompt the user with three option. Either to 
 * either to encode date or decode the data. The last option is to stop the 
 * program

/*
 * This class will the prompt the user with three options. Either to encode the
 * data or decode the data. The last option is to stop the program
 */
public class Exercise06 {

	/*
	 * the method prompts the user to enter data and make a choice or either
	 * encoding the data, decoding the data or close the program.
	 */
	public static void main(String[] args) {
		final int ENCODE = 1;
		final int DECODE = 2;
		final int EXIT = 0;
		int option = 0;
		String userText = "";
		String formatString = "%d %s%n";
		SimpleCipher cipher = new SimpleCipher();

		do {
			System.out.printf(formatString, ENCODE, "to encode text");
			System.out.printf(formatString, DECODE, "to decode text");
			System.out.printf(formatString, EXIT, "to exit program");
			option = User.inputInteger("Enter option: ");
			switch (option) {
			case ENCODE:
				userText = User.inputString("Enter text to encode ");

				userText = cipher.encode(userText);

				System.out.printf("result:%n%s%n", userText);
				break;
			case DECODE:
				userText = User.inputString("Enter text to decode ");
				userText = cipher.decode(userText);
				System.out.printf("result:%n%s%n", userText);
				break;
			case EXIT:
				System.out.printf("%s%n", "Program will exit now.");
				break;
			default:
				System.out.printf("%s%n", "Invalid Option.");
				break;
			}
		} while (option != 0);

		// the program the name of the programer
		System.out.println("Program by Ishtiaque Matin");

	}
}

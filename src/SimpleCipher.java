/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 26th, 2021
 * Modified: Nov 26th, 2021
 * Description: This class will process the different ciphers, it will encode,
 * decode and reverse the data
 */

/*
 * The class takes the input data and processes according to encode, decode
 * or reverse the data
 */
public class SimpleCipher {

	/*
	 * the method takes the input data and encode the data by increasing the unicode
	 * value by 2
	 */
	public String encode(String text) {

		String result = " ";

		// convert text into char array
		char[] letters = text.toCharArray();

		// reverse the array using provided method (see below)
		letters = reverse(letters);

		// loop over array adding 2 to each element
		for (int index = 0; index < letters.length; index++) {

			letters[index] = (char) (letters[index] + 2);

			// convert the char array back to a String named result
			result = new String(letters);
		}

		// return the resulting String.
		return result;
	}

	/*
	 * the method takes the input data and decode the data by decreasing the unicode
	 * value by 2
	 */
	public String decode(String text) {
		String result = "";

		// convert text into char array
		char[] letters = text.toCharArray();

		// reverse the array using provided method (see below)
		letters = reverse(letters);

		// loop over array subtracting 2 from each element
		for (int index = 0; index < letters.length; index++) {

			letters[index] = (char) (letters[index] - 2);
			// convert the char array back to a String named result
			result = new String(letters);
		}

		// return the resulting String.
		return result;
	}

	/*
	 * the method take the input data and reverses the order
	 */
	private char[] reverse(char[] original) {
		int length = original.length;
		char[] reversed = new char[length];
		int writeIndex = 0;
		for (int readIndex = length - 1; readIndex >= 0; readIndex--) {
			reversed[writeIndex] = original[readIndex];
			writeIndex++;
		}
		// the readIndex above starts at the last index, and stops at index zero
		// the writeIndex starts at zero, and stops at the last index.
		return reversed;
	}
}

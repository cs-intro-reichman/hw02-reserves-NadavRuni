/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {

		String x = args[0];
		int l = x.length();
		int i = 0, place = l - 1;
		int middle = place / 2;
		while (i < l) {
			System.out.print(x.charAt(place));
			place--;
			i++;
		}
		System.out.println("");
		System.out.println("The middle character is " + x.charAt(middle));

	}
}

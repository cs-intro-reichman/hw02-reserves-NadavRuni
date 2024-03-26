/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int i = 1;
		int l = 0;
		while (i <= x) {
			if (i % 2 == 0)
				System.out.print(" ");
			while (l < x-1) 
			{
				System.out.print("* ");
				l++;
			}System.out.print("*");
			l = 0;
			System.out.println();
			i++;

		}
		//System.out.println("");
	}

}

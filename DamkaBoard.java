/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int i = 1;
		int l = 0;
		boolean q;
		while (i <= x) {
			q=(i % 2 == 0);
			if (q)
			{
				System.out.print(" ");
			}
				
			while (l < x-1) 
			{
				System.out.print("* ");
				l++;
			}
			if (!q)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("*");

			}
			
			l = 0;
			System.out.println();
			i++;

		}
		//System.out.println("");
	}

}

/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {

		int x=3;
		int [] y ={1,2,3};
		
		triple1(x);
		triple2(y);
		System.out.println(x);
		for(int i =0;i<x;i++)
			{
				System.out.print(y[i]+" ");
			}
		
	}
	
		/**String x = args[0];
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
		 */
		public static void triple1(int a){
			a=3*a;
		}
		public static void triple2(int[] a){
			for(int i =0;i<a.length;i++)
			{
				a[i]=3*a[i];
			}
		}

	}


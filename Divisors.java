public class Divisors {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int i = 1;
		int mod;
		while (i <= x) {
			mod = x % i;
			if (mod == 0)
				System.out.println(i);
			i++;

		}
	}

}

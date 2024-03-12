public class Perfect {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int i = 1, sum = 0;
		int remi = 0;
		boolean b = false;
		while ((i < x) && (b == false)) {
			sum = sum + i;
			if (x == sum) {
				remi = i;
				i = 1;
				System.out.print(x + " is a perfect number since " + x + " = ");
				while (i <= remi) {
					if (i < remi) {
						System.out.print(i + " + ");
					} else {
						System.out.print(i+ " + ");
					}

					i++;

				}

				b = true;
			}

			i++;
		}

		if (b == false)
			System.out.println(x + " is not a perfect number ");

	}

}

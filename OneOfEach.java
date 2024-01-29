public class OneOfEach {
	public static void main(String[] args) {

		int i = 0, help;
		double rand = Math.random() * 2 + 1;
		int cboy = 0, cgirl = 0, ckids = 0;
		while ((cboy == 0) || (cgirl == 0)) {
			help = (int) rand;
			if (help == 1) {
				System.out.println("b ");
				cboy++;
			} else {
				System.out.println("g ");
				cgirl++;
			}
			rand = Math.random() * 2 + 1;
			i++;

		}
		System.out.println("You made it... and you now have " + (cboy + cgirl) + " children");

	}

}

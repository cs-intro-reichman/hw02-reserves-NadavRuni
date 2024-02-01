public class OneOfEachStats1 {
	public static void main(String[] args) {
		int T1 = Integer.parseInt(args[0]);
		int i = 0, help, num2 = 0, num3 = 0, num4ormore = 0, total = 0;
		double rand = Math.random() * 2 + 1;
		int cboy = 0, cgirl = 0;
		for (int q = 0; q < T1; q++) {

			while ((cboy == 0) || (cgirl == 0)) {
				help = (int) rand;
				if (help == 1) {
					cboy++;
				} else {
					cgirl++;
				}
				rand = Mth.random() * 2 + 1;
				i++;
			}
			if (cboy + cgirl == 2)
				num2++;
			else if (cboy + cgirl == 3)
				num3++;
			else
				num4ormore++;
			total = total + cboy + cgirl;
			cboy = 0;
			cgirl = 0;
		}
		double avg1 = (double) total / T1;
		System.out.println(total);
		System.out.println("Average: " + avg1 + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + num2);
		System.out.println("Number of families with 3 children: " + num3);
		System.out.println("Number of families with 4 children: " + num4ormore);
		if ((num2 >= num3) && (num2 >= num4ormore)) {
			System.out.println("The most common number of children is 2.");
		} else if ((num3 >= num2) && (num3 >= num4ormore)) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4.");
		}

	}

}

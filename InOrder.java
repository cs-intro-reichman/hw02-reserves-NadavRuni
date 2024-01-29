
public class InOrder {
	public static void main(String[] args) {
		double rand;
		int a, big;
		boolean b = true;
		rand = (Math.random() * (10));
		a = (int) rand;
		big = a;
		System.out.print(a + " ");
		while (b == true) {
			rand = (Math.random() * (10));
			a = (int) rand;
			if (big > a)// בדיקה האם המספר החדש יותר קטן
			{
				b = false;
			} else {
				big = a;
				System.out.print(a + " ");
			}
		}

	}

}

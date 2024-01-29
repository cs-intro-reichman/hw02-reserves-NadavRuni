
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
				System.out.println("");
				System.out.println("next number was " + a);// אמנם לא במסגרת המשימה , אך נמצא פה על מנת לבדוק את עצמי,
															// תסלח לי בודק יקר
			} else {
				big = a;
				System.out.print(a + " ");

			}
		}

	}

}

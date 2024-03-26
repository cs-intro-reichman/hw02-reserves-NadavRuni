public class Perfect {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int i = 2, sum = 1;
		int remi = 0;
		boolean b = false;
		int mod;
		String end=x + " is a perfect number since 1";
		while (i < x) {
			mod = x % i;
			if (mod == 0)
			{
				sum+=i;
				end=end +" + "+ i ; 
				
			}
				
			i++;
		}
		if (sum==x)
		{
			end=end +" = "+x;
			System.out.println(end);
		}
		
          
		else 
		{
			System.out.println(x + " is not a perfect number ");
		}

	}

}

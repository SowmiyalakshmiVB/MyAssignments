package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args)
	{
		int a = 17;
		int b = 0;
		for(int i=1;i<=a;i++) {
			if(a % i == 0) {
				b++;
			}
		}
		if(b==2) {
		System.out.println("Prime");
		}
		else
		{
		System.out.println("Not Prime");
		}
	}

}

package week1.day2;

public class Palindrome {
	public static void main(String args[])
	 {
		 int a = 121;
		 int b = 0;
		 int c = 0;
		 int d = a;
		 
		 while(a!=0) 
		 {
			 c = a%10;
			 b = b * 10 +c;
			 a = a/10;
		 }
		 if(d == b)
		 {
			 System.out.println(d + "is palindrome number");
		 }
		 else {
			 System.out.println(d + " is not palindrome number");
		 }
	 }
		 
	

}

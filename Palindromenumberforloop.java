package DAY2ASSINGMENT;

public class Palindromenumberforloop {

	public static void main(String[] args) {
	
      int n = 121;
      int rev=0;
		
		for(;n!=0; n/=10) {
			
		int letter = n % 10;
		
		rev = rev * 10 + letter;
		
		
		}
		System.out.println(rev);
		
		if(n==rev) {
			System.out.println("no is palindrome");
		}
		else {System.out.println("no is non palindrome");
			
		}

	}

}

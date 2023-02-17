package DAY2ASSINGMENT;

public class resintinforloop {

	public static void main(String[] args) {

		int n = 198, rev = 0;
		
		for(;n!=0; n/=10) {
			
		int letter = n % 10;
		
		rev = rev * 10 + letter;
		
		
		}
		System.out.println(rev);


	}

}

package DAY2ASSINGMENT;

public class sumofnaturalno {

	public static void main(String[] args) {
		//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
        
		int n=8;
		int sum=0;
		 
		for(int i=1; i<=n; i++) {
			
			sum=sum+i;
			
			//first check 1<=3 --yes then sum=0+1=1
			// next check 2<=3 --yes then sum=1+2
			// next check 3<=3 --yes  then sum=2+3
			//next check 4<=3 --no so goto out of loop
			
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}

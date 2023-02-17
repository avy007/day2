package DAY2ASSINGMENT;

public class opratorfindmaxmin {

	public static void main(String[] args) {
		//1
		int a=1;
		int b=2;
		int c = 0;
		int d=a+b*c;
		System.out.println(d);
		//2
		int e=c+a/b;
		System.out.println(e);
		//3
		int f=a%b+c;
		System.out.println(f);
		//
		int g=a*b+c;
		System.out.println(g);
		
		 int max=Math.max(Math.max(a,b),c);
		 int min=Math.min(Math.min(a,b),c);
		 
		 System.out.println("Maximum number "+max);
	     System.out.println("Minimum number "+min);
		

	}

}

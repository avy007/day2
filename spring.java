package DAY2ASSINGMENT;

public class spring {

	public static void main(String[] args) {
		
        int month ,day;
        month=Integer.parseInt(args[0]);
        day=Integer.parseInt(args[1]);
	    
	   if((month == 3 && day >= 20 && day <= 31)
         || (month == 4 && day >=  1 && day <= 30)
         || (month == 5 && day >=  1 && day <= 31)
         || (month == 6 && day >=  1 && day <= 20)) {
		   
		    System.out.println("trure ");
						}
	   else {System.out.println("false");}
						
						

      

	}

}

import java.util.*;
class taxes
{
    public static void main(String[] args)
	{
       	double x,y;
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter the amount:");
        	double amount = input.nextDouble();
		if(amount<=0)
		{
			System.out.println("Invalid");
			return;
		}
        	if(amount<=250000)
        	{
            	System.out.println("No Tax"); 
        	}
        	else if(amount>250000 && amount<=300000)
        	{
           		y=0.05*amount;
           		System.out.println("Tax: "+y);
        	}
         	else if(amount>300000 && amount<=400000)
        	{
           		
           		y=0.1*amount;
           		System.out.println("Tax: "+y);
        	}
         	else if(amount>400000 && amount<=500000)
        	{
           		y=0.15*amount;
           		System.out.println("Tax: "+y);
        	}
        	else if(amount>500000 && amount<=700000)
        	{
          		y=0.2*amount;
                  System.out.println("tax:"+y);
        	}
           
            else if(amount>700000 && amount<=900000)
        	{
          		y=0.25*amount;
                  System.out.println("tax:"+y);
        	}
            else if (amount>900000)
        	{
          		y=0.3*amount;
                  System.out.println("tax:"+y);
        	}
            else{
                 System.out.println("invalid data");
            }

    	}
}

    	

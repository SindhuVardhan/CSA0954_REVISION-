import java.io.*;
import java.util.*;
class numdiv{
public static void main(String args[]){
try{
Scanner sc =new Scanner(System.in);
int n,c=0;
System.out.println("enter the number:");
n=sc.nextInt();
System.out.println("enter the number:");
while(n>0){
c++;
if(n%2==0){
System.out.printf("\nsteps %d:- %d is even;divide by 2 and obtain",c,n);
n=n/2;
System.out.println(n);
}
else{
System.out.printf("\nsteps %d:- %d is odd;substarct 1 and obtain ",c,n);
n=n-1;
System.out.println(n);
}
}
System.out.println("\n total steps are:"+c);
}
catch(Exception e)
		{
			System.out.println(e);
			System.out.println("data Invalid ");
		}
	}
}

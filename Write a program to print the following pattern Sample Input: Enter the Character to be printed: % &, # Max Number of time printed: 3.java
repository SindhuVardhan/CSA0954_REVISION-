import java.util.*;
public class charpat
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		int n,i,j,k;
		System.out.print("Enter no of rows: ");
		n=sc.nextInt();
		char a[]=new char[n];
		System.out.print("enter the characters: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.next().charAt(0);
		}
		System.out.println("the Pattern is : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
}

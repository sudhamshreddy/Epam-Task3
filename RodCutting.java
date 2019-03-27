package epam_task_3;
import java.util.Scanner;

public class RodCutting {
	public static void main(String[] args) {
		int l;
		long n,total=0;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			total=0;
			n=sc.nextLong();
			if(n==1)
			{
				total=0;
			}
			else
			{
				n=n+1;
				long temp=n;
				while(temp!=0)
				{
					temp=temp/2;
					total++;
				}
				total=total-2;
			}
			System.out.println(total);
		}
		sc.close();
	}
}
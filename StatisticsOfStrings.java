package epam_task_3;
import java.util.Scanner;
class StatisticsOfStrings {
 int arr[]=new int[25];
	public int Find(int i){
		if(arr[i]==i)
		{
			return i;
		}
		else
		{
			arr[i]=Find(arr[i]);
			return arr[i];
		}
	}
	public void Solution()
	{
		long p=1;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<25;i++)
		 {
			 arr[i]=0;
		 }
		int n = sc.nextInt();
		int answer=0;
		int power=(int) (Math.pow(10, 5)+7);
		int a = sc.nextInt();
		power = sc.nextInt();	
		sc.close();
		for(int i=1;i<n;i++)
		{
			for (long j=1,s; j<(1<<(n-i)); j++)
            { s=-1;
			    for (int k=0; k<n; k++)  {arr[k]=k;}
			    for (int k=1; k<=n-i; k++)
                 { 
            	 if((j&(1<<(k-1)))>0)
            	 {
            		 s=-s;
            		 for (int l=0; l<i; l++)
            		 { 
            			 if (Find(l)!=Find(k+l))
                             {
            				 arr[Find(k+l)]=Find(l);
            				 
            				 }
            		 }
            	  }
                   }
			   
			    if (s<0) { s+=power;}
                for (int k=0; k<n; k++)
                    if (Find(k)==k) { s=p*(s*a)%power;}
                answer=(int) ((answer+s)%power);
            }
			
			
		}
		System.out.println(answer);
	}
	public static void main(String[] args) {
		new StatisticsOfStrings().Solution();
		}
}
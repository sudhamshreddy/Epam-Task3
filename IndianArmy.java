package epam_task_3;
import java.util.*;
public class IndianArmy
{
	static long d;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCheckPoints =sc.nextInt();
		long startPos = sc.nextLong();
		long endPos = sc.nextLong();
		long right[]=new long[numCheckPoints];
		long left[]=new long[numCheckPoints];
		long a,b;
		long dis;
		sc.close();
		for(int i=0;i<numCheckPoints;i++){
		    right[i]=(a=sc.nextLong())+(b=sc.nextLong());
		    left[i]=a-b;
		}
		
		for(int i=0;i<numCheckPoints;i++){
		    for(int j=i+1;j<numCheckPoints;j++){
		        if(left[i]>left[j]){
		            long t=left[j];
		            left[j]=left[i];
		            left[i]=t;
		            
		            t=right[j];
		            right[j]=right[i];
		            right[i]=t;
		        }
		    }
		}
	
		if(endPos<left[0]){
			dis=endPos-startPos;
		}else
	    dis=Trace(startPos,endPos,left,right,0);
		System.out.println(dis);
	}
	static long Trace(long S,long E,long left[],long right[],int k){
	    if(S>=E){
	        return d;
	    }
	    if(S<left[k]){
			d=d+(left[k]-S);
			
	    }
		if(S>right[k]){
			right[k]=S;
		}
	    return Trace(right[k],E,left,right,k+1);
	}
}

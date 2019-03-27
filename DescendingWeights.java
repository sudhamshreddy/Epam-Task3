package epam_task_3;
import java.util.*;
class Weights implements Comparator<Weights>{
	int key;
	int changed;
	public int compare(Weights w1,Weights w2){
		if(w2.changed == w1.changed){
			return w1.key - w2.key;
		}
		return w2.changed-w1.changed;
	}
	public String toString()
	{
		return ""+key;
	}
}
class DescendingWeights {
	
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        //HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		ArrayList<Weights> al=new ArrayList<Weights>();
        for(int i=0;i<n;i++){
			Weights w=new Weights();
            w.key=sc.nextInt();
            w.changed=(w.key)%k;
			al.add(w);
        }
        sc.close();
		Collections.sort(al, new Weights());
        for(int i=0;i<n;i++){
        System.out.print(al.get(i)+" ");
        }
    }
}
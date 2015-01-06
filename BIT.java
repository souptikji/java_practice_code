package practice1;

import edu.princeton.cs.introcs.StdIn;

public class BIT {
	
	public int max;
	public int[] arr;
	
	public void update(int idx,int val)
	{
		while(idx<=max)
		{
			arr[idx]+=val;
			idx+=idx&-idx;
		}
	}//update
	
	public BIT(int[] freq)
	{
		arr=new int[freq.length];
		max=freq.length;
		for(int i=1;i<freq.length;i++) update(i,freq[i]);
	}
	
	public int cumFreq(int idx)
	{
		int sum=0;
		while(idx>0)
		{
	        sum+=arr[idx];
			idx-=idx&-idx;
		}
		return sum;
	}//cumFreq
	
	public int indFreq(int idx)
	{
		return(cumFreq(idx)-cumFreq(idx-1));
	}
	
	public void bitprint()
	{
		System.out.println("BIT is");
		for(int i=1;i<max;i++) System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	
	//tester
	public static void main(String[] args)
	{
		int n=StdIn.readInt();
		System.out.println("Enter "+n+" items");
		int[] freq= new int[n];
		for(int i=1;i<n;i++) 
			{
			    System.out.print("Enter "+i+" ");			   
			    freq[i]=StdIn.readInt();
			}
		BIT myBIT= new BIT(freq);
		myBIT.bitprint();
		myBIT.update(3, 5);
		myBIT.bitprint();
		System.out.println("Cumulative frequencies are");
		for(int i=1;i<myBIT.max;i++) System.out.println(myBIT.cumFreq(i));
		
	}

}

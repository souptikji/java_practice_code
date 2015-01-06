package practice1;
import java.util.*;

public class ArrayList1 {
	
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) list.add((Integer)i);
		System.out.println("Printing elements");
		for(int i=0;i<list.size();i++) System.out.print(i==list.size()-1? list.get(i)+" \n":list.get(i)+" ");
		list.add(3,6);
		for(int i=0;i<list.size();i++) System.out.print(i==list.size()-1? list.get(i)+" \n":list.get(i)+" ");
		System.out.println(list.contains(6));
		System.out.println("Index of 6 in this array is "+list.indexOf(6));
		
		Vector<Integer> arrl = new Vector<Integer>();
		arrl.addAll(list);
		
		
	}

}

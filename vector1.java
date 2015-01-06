package practice1;
import java.util.*;

public class vector1 {
	
	public static void main(String[] args)
	{
		Vector<String> v= new Vector<String>();
		
		//input all elements
		String input="a";
		for(int i=0;i<5;i++)
		{
			input+=(char)('a'+i);
			v.add(input);
		}//add elements
		
		v.add(2,"amna");
		
		Vector<String> vcopy= (Vector<String>)v.clone();
		
		/*for(int i=0;i<v.size();i++) System.out.println(v.get(i));
		System.out.println(v);
		System.out.println("The first element is "+v.firstElement());
		System.out.println("The last element is "+v.lastElement());
		System.out.println("Vector is empty "+v.isEmpty());*/
		
		/*System.out.println("Iteration by iterators ");
		Iterator<String> itr= v.iterator();
		while(itr.hasNext()) System.out.println(itr.next());*/
		
		Enumeration enm= vcopy.elements();
		while(enm.hasMoreElements()) System.out.println(enm.nextElement());
		
		/*List<String> list= new ArrayList<String>();
		System.out.println(list.containsAll(v));
		
		String[] copyArr= new String[v.size()];
		v.copyInto(copyArr);
		for(String s:copyArr) System.out.println(s);*/
		
		List<String> alist=v.subList(2, 3);
		Vector<String> copy= new Vector<String>(alist);
		
		
		
		
	}

}
 
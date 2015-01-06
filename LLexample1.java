package practice1;
import java.util.*;

import edu.princeton.cs.introcs.StdIn;

 
public class LLexample1 {
	
	public static void head2null(Node head)
	{
		head=null;
		return;
	}
	public static Node getNthNode(Node head,int n)
	{
		Node itr=head;
		int cnt=0;
		while(itr!=null)
		{
			if(cnt==n) break;
			else
			{
				cnt++;
				itr=itr.next;
			}
		}//while
		return itr;
	}
	
	public static Node delete(Node head, int d)
	{
		if(head==null) return head;
		if(head.data==d)  return head.next;
		Node itr=head;
		while(itr.next!=null)
		{
			if(itr.next.data==d)
			{
				itr.next=itr.next.next;
				return head;
			}
			itr=itr.next;
		}
		return head;
	}
	
	
    public static void main(String[] args)
	{
		LinkedList ll= new LinkedList();
		int n=StdIn.readInt();
		for(int i=0;i<n;i++) ll.addToHead(i);
		ll.reverse();
		head2null(ll.head);
		System.out.println("After head2null");
		ll.printList();
		for(int i=0;i<10;i++)
		{
			int data=StdIn.readInt();
			ll.head=delete(ll.head,data);
			ll.printList();
		}	
	}

}

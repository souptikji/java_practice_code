package practice1;

public class LinkedList {
	
	public Node head;
	
	public LinkedList()
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		return(head==null);
	}
	
	public void printList()
	{
		Node itr=head;
		while(itr!=null)
		{
			System.out.println(itr.data);
			itr=itr.next;
		}
	}
	
	public void addToHead(int num)
	{
		Node newnode=new Node(num);
		newnode.next=head;
		head=newnode;
	}
	
	public static Node reverse1(Node head)
	{
		if(head==null||head.next==null) return head;
		Node newhead=reverse1(head.next);
		head.next.next=head;
		head.next=null;
		return(newhead);
	}
	
	public void reverse()
	{
		this.head=reverse1(this.head);
	}
}

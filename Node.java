package practice1;

public class Node {
	
	public int data;
	public Node next;
	
	public Node(int data)
	{
		this.data=data;
	}
	
	public String toString()
	{
		return(data+"->");
	}
	
}

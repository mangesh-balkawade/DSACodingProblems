package datastructure;

class Node
{
	int data;
	Node next;
}

class LinkedList
{
	int count=0;
	Node head=null;
	
	public void insertFirst(int data1)
	{
		Node newn=new Node();
		newn.next=null;
		newn.data=data1;
		
		if(head==null)
		{
			head=newn;
		}
		else
		{
			newn.next=head;
			head=newn;
		}
		this.count++;
	}
	
	public void insertLast(int data1)
	{

		Node newn=new Node();
		newn.next=null;
		newn.data=data1;
		if(head==null)
		{
			head=newn;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newn;
		}	
		this.count++;
	}
	
	public void insertBetween(int data1,int pos)
	{
		Node newn=new Node();
		newn.next=null;
		newn.data=data1;
		if(head==null)
		{
			head=newn;
		}
		else
		{
			Node temp=head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
		}
	}
	
	public void deletefirst()
	{
		if(head==null)
		{
			
		}
		else
		{
			head=head.next;
			this.count--;
		}
		
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
			this.count--;
		}
	}
	
	public void deleteBetween(int pos)
	{
		if(head==null)
		{
			
		}
		else
		{
			Node temp=head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}	
	}
	public void display1(Node temp)
	{
		if(temp==null)
			return;
		display1 (temp.next);
		System.out.println(temp.data);
	}
	
	
}

public class LinkedListTester 
{
	public static void intersect(LinkedList l1,LinkedList l2)
	{
		Node temp1=l1.head;
		Node temp2=l2.head;
		while(temp1 != null)
		{
			while(temp2!=null)
			{
				if(temp1.data==temp2.data)
				{
					System.out.println(temp2.data);
					break;
				}
				temp2=temp2.next;
			}
			temp1=temp1.next;
			temp2=l2.head;
		}
	}
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.insertFirst(4);
	l1.insertFirst(3);
	l1.insertFirst(2);
	l1.insertFirst(1);
	l1.display1(l1.head);
	
	
	
	
}
}

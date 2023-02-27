package datastructure;

public class MergeSortedList {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.insertLast(1);
	l1.insertLast(3);
	l1.insertLast(5);
	l1.insertLast(8);
	LinkedList l2=new LinkedList();
	l1.insertLast(2);
	l1.insertLast(4);
	l1.insertLast(7);
	
	LinkedList l3=new LinkedList();
	Node first=l1.head;
	Node second=l2.head;
	while(first!=null&&second!=null)
	{
		System.out.println("_____--");
		if(first.data<second.data)
		{
			System.out.println(first.data);
			l3.insertLast(first.data);
			first=first.next;
		}
		else
		{
			l3.insertLast(second.data);
			second=second.next;
		}
		if(first==null)
		{
			while(second!=null)
			{
				l3.insertLast(second.data);
				second=second.next;
			}
			break;
		}
		if(second==null)
		{
			while(first!=null)
			{
				l3.insertLast(first.data);
				first=first.next;
			}
			break;
		}
		
	}
	l3.display();
	
	
}
}

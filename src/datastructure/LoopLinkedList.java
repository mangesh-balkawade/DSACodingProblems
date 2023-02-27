package datastructure;


class FindLoop
{
	public void addNode()
	{
		LinkedList list=new LinkedList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		Node temp=list.head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=list.head.next.next;
		
		Node slow=list.head;
		Node fast=list.head;
		while(fast!=null&&slow!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
			{
				System.out.println("Loop In The List");
				System.out.println(fast.next);
				System.out.println(fast.next.next);
				System.out.println(slow);
				break;
			}
			
		}
		
	}
}

public class LoopLinkedList {
	public static void main(String[] args) {
		FindLoop f=new FindLoop();
		f.addNode();
	}

}

package datastructure;

class Q
{
	int arr[];
	int index=0;
	public Q() {
		arr=new int[100];
	}
	
	public void peek(int no)
	{
		arr[index]=no;
		index++;
	}
	
	public void poll()
	{
		for(int i=0;i<index;i++)
		{
			arr[i]=arr[i+1];
		}
	}
	public void show()
	{
		for(int i=0;i<index;i++)
			System.out.print(arr[i]+" ");
	}
}
public class QueueX {
public static void main(String[] args) {
	Q obj=new Q();
	obj.peek(1);
	obj.peek(2);
	obj.peek(3);
	obj.show();
	obj.poll();
	obj.show();
	
	
}
}

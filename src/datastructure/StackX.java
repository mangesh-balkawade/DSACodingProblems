package datastructure;

class StackI
{
	int arr[];
	int top;
	int index;
	
	public StackI(int isize)
	{
		arr=new int[isize];
		top=-1;
		index=0;
	}
	public StackI() {
		// TODO Auto-generated constructor stub
		arr=new int [10];
		top=-1;
		index=0;
	}
	
	public void push(int i)
	{
		this.arr[index]=i;
		top=index;
		index++;
	}
	
	public void pop()
	{
		this.arr[index-1]=0;
		index--;
		top=index;
		if(index<0)
			{
			index=0;
			}
	}
	public int top()
	{
		if(top==-1)
			return -1;
		return arr[top];
	}
	public void display()
	{
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(arr[i]+"->");
		}
	}
}

public class StackX 
{
public static void main(String[] args)
{
  	StackI obj=new StackI();
  	obj.push(1);
  	obj.push(2);
  	obj.push(3);
  	obj.push(4);
  	obj.push(5);
  	obj.display();
  	System.out.println();
  	System.out.println(obj.top());
  	obj.pop();
  	obj.display();
}
}

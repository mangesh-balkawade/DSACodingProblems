package datastructure;

public class RotateArray 
{
 public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int shift=1;
	for(int i=0;i<shift;i++)
	{
	for(int j=0;j<arr.length-1;j++)
	{
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
	}
	}
	for(int i:arr)
	{
		System.out.println(i);
	}
	
}
}

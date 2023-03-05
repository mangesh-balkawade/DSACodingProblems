package Programs;

public class Wiley {
public static void main(String[] args) {
	int arr[][]= {{11,22,33},{44,55,66},{77,88,99}};
	new Service().sol(arr,66);
}}

class Service
{
	void sol(int arr[][],int x)
	{
		int i=0,j=0;
		boolean flag=false;
		for( i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==x)
				{
					flag=true;
					
				}
			}
			if(flag==true)
				break;
		}
	
		int sum=i+j;
		System.out.println(i);
		while(sum>0)
		{
			
			++i;
			--sum;
			if(i==arr.length)
				i=0;
		}
		
		System.out.println(i+" "+j);
		System.out.println(arr[i][j]);
	}
	
	
}

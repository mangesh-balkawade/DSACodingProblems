package datastructure;

public class ContinuousSequenceInArray 
{
 public static void main(String[] args) {
	int arr[]= {1,-1,-2,-3,4,5,2,'a',3,4,5,6,3,7,'@',8,1,2,10};
	int k=0;
	int i=0;
	int m=0;
	for( i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<0)
			{
			if(arr[i]-1==arr[j])
			{
				for( k=j;k<arr.length-1;k++)
				{
					if(arr[k]-1!=arr[k+1])
						break;
				}
				for( m=i;m<=k;m++)
				{
					System.out.print(arr[m]+" ");
				}
			}
			else
			{
				break;
			}
			k=0;
			System.out.println();
			i=m-1;
			}
			else
			{
			
			if(arr[i]+1==arr[j])
			{
				for( k=j;k<arr.length-1;k++)
				{
					if(arr[k]+1!=arr[k+1])
						break;
				}
				for( m=i;m<=k;m++)
				{
					System.out.print(arr[m]+" ");
				}
			}
			else
			{
				break;
			}
			k=0;
			i=m-1;
			System.out.println();
			}
		}
	}
}
}

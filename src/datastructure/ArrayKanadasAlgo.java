package datastructure;

// Maximum array Sum

public class ArrayKanadasAlgo 
{
	static void maxSumKanda(int arr[])
	{
		  int max=arr[0];
		  int currentMAx=arr[0];
		   for (int i = 0; i < arr.length; i++) 
		   {
			  currentMAx+=arr[i];
			  if(currentMAx>max)
			  {
				  max=currentMAx;
			  }
			  if(currentMAx<0)
			  {
				  currentMAx=0;
			  }
		}
		   System.out.println(max);
	}
	
	static void maxSumBrute(int arr[])
	{
		int isum=0;
		int max=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				isum=isum+arr[j];
				if(isum>max)
					max=isum;
			}
			isum=0;
		}
		System.out.println(max);
	}
	
	static void minSumBrute(int arr[])
	{
		int isum=0;
		int min=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				isum=isum+arr[j];
				if(isum<min)
					min=isum;
			}
			isum=0;
		}
		System.out.println(min);
	}
	
 public static void main(String[] args) 
 {
  int arr[]= {-5,4,6,-3,4,-3,-2,-1};
   maxSumKanda(arr);
   maxSumBrute(arr);
   minSumBrute(arr);
  }
}

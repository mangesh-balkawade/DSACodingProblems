package Programs;

import java.util.LinkedList;
import java.util.List;

public class Notes {
public static void main(String[] args) {
	
	int arr[]= {5,10,15,50};
	int rs=2;
	List<Integer> li=new LinkedList();
	int sum=0;
	while(sum!=rs)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=1;;j++)
			{
				sum=sum+arr[i];
				if(sum>rs)
				{
					sum=sum-arr[i];
					break;
				}
				
				li.add(arr[i]);
				if(sum==rs)
					break;
				
				
			}
			if(sum==rs)
				break;
			
		}
		if(sum==rs)
			break;
	}
	System.out.println(li);
	
}
}

package bits;

public class BitsX {
public static void main(String[] args) {
	int arr[]= {1,1,1,2,2,2,3,3,3,4};
	System.out.println(binary("",11));
}

static int occurOne(int arr[])
{
	int ret=0;
	for(int num:arr)
	{
		ret^=num;
	}
	return ret;
}

static String binary(String temp,int no)
{
	if(no>0==false)
		return temp;
	temp+=no%2;
	no=no/2;
	binary(temp,no);
	return temp;
	
}
static int occurNTimes(int arr[],int n)
{
	int ret=0;
	for(int num:arr)
	{
		ret+=num;
	}
	return ret%n;
}
}

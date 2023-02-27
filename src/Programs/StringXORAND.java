package Programs;

public class StringXORAND 
{
  public static void main(String[] args) {
	String str="1C0C1C1A0B1";
	char arr[]=str.toCharArray();
	int ans=arr[0];
	int temp=arr[0];
	for (int i = 1; i < arr.length-1; i=i+2) 
	{
	 if(arr[i]=='A')
	 {
		 ans=ans&arr[i+1];
	 }
	 else if(arr[i]=='B')
	 {
		 ans=ans|arr[i+1];
	 }
	 else if(arr[i]=='C')
	 {
		 ans=ans^arr[i+1];
	 }
	 
	}
	System.out.println((char)ans);
}
}

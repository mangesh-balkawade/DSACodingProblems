//package datastructure;
//
////class Node
////{
////	int hash;
////	int key;
////	String value;
////	Node next;
////}
//
//class HashMapX
//{
//	
//	Node arr[]=new Node[7];
//	
//	public int calculateHash(int key)
//	{
//		return (key%7);
//	}
//	
//	public void add(int key,String value)
//	{
//		int hash=this.calculateHash(key);
//		System.out.println(hash);
//		Node newn=new Node();
//		   newn.hash=hash;
//		   newn.key=key;
//		   newn.next=null;
//		   newn.value=value;
//		if(arr[hash]==null)
//		{		
//		   arr[hash]=newn;
//		  System.out.println("first time");
//		}
//		else
//		{
//			Node temp=arr[hash];
//			while(temp.next!=null)
//			{
//				if(temp.key==key)
//				{
//					System.out.println("key is duplicate");
//					temp=newn;
//					break;
//				}
//				temp=temp.next;
//			}
//			temp.next=newn;
//		}
//	}
//}
//
//public class CustomeHashMap {
//	public static void main(String[] args) {
//		HashMapX obj=new HashMapX();
//		obj.add(17,"Mangesh");
//		obj.add(12,"Shubham");
//		obj.add(14,"Ram");
//		obj.add(15,"Mangesh");
//		obj.add(17,"Mangesh");
//		
//	}
//	
//
//}

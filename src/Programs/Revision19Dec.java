package Programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

class ServiceX
{
	public void iterate()
	{
		List<Integer> li=List.of(13,14,56,2,3,4,12,3,7,6);
		LinkedList<Integer> li2=new LinkedList<Integer>();
		li2.addAll(li);
//		for(int i:li2)
//		{
//			System.out.println(i);
//		}
//		Iterator<Integer> itr=li2.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		for(int i=0;i<li2.size();i++)
//		{
//			for(int j=i+1;j<li2.size();j++)
//			{
//				if(li2.get(i)>li2.get(j))
//				{
//					int temp=li2.get(j);
//					li2.set(j,li2.get(i));
//					li2.set(i, temp);
//				}
//			}
//		}
//		
	//	li2.sort((e1,e2)->e1-e2);
//		System.out.println(li2);
//		LinkedList<Integer> li3=new LinkedList<>();
//		HashMap<Integer, String> map1=new HashMap<>();
//		map1.put(1, "Mangesh");
//		map1.put(2,"Shubham");
//		map1.put(3, "Ram");
//		for(int i:map1.keySet())
//		{
//			System.out.println(map1.get(i));
//		}
//		for(Entry<Integer, String> i:map1.entrySet())
//		{
//			System.out.println(i.setValue("ma"));
//		}
//		System.out.println(map1);
		
//		LinkedList<Integer> li=new LinkedList<>();
//		li.add(1);
//		li.add(2);
//		li.forEach(e->System.out.println(e));
//		System.out.println(li.contains(2));
//		li2.sort((e1,e2)->e2-e1);
//		System.out.println(li2);
//		for(int i=0,j=li2.size()-1;i<j;i++,j--)
//		{
//			int temp=li2.get(i);
//			li2.set(i, li2.get(j));
//			li2.set(j, temp);
//		}
		//System.out.println(li2);
//		String s1=li.toString();
//		String s2=li2.toString();
//		System.out.println(s1+" "+s2);
//		if(s1.equals(s2))
//			System.out.println("equal");
//	  //  li2.clear();
//	    System.out.println(li2+" ");
//	    int i=li2.remove(0);
		
//		HashSet<Integer> set1=new HashSet<>();
//		set1.add(1);
//		set1.add(2);
//		set1.add(3);
//		set1.add(4);
//		System.out.println(set1);
//		
//		Iterator itr=set1.iterator();
//	  LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
//	  lhs.add(11);
//	  lhs.add(2);
//	  lhs.add(23);
//	  lhs.add(8);
//	  Iterator<Integer> itr2=lhs.iterator();
//	  LinkedHashSet<Integer> lhs2=new LinkedHashSet<>(lhs);
//	  TreeSet<Integer>ts=new TreeSet<>(lhs);
//	  System.out.println(ts);
//	  ArrayList<Integer> li3=new ArrayList<>(ts);
//	  System.out.println(li3);
		
//		TreeSet<Integer> t1=new TreeSet<>(li);
//		TreeSet<Integer> t2=new TreeSet<>(li);
//		t2.add(11);
//		t2.add(21);
//		t2.add(51);
//		t2.add(101);
//		System.out.println(t1);
//		System.out.println(t2);
//		LinkedList<Integer> remain=new LinkedList<>();
//		for(Integer  i:t1.size()>t2.size()?t1:t2)
//		{
//			boolean flag=true;
//			for(Integer j:t1.size()<t2.size()?t1:t2)
//			{
//				System.out.println(i+" "+j);
//				if(i==j)
//				{
//					flag=false;
//					break;
//				}
//			}
//			if(flag==true)
//				remain.add(i);
//			flag=true;
//				
//		}
//		System.out.println(remain);
//		String s1=t1.toString();
//		String s2=t2.toString();
//		System.out.println(s2);
//		String str1="Mangesh";
//		String str2="Balkawade";
//		str1=str1+str2;
//		str2=str1.replaceAll(str2,"");
//		str1=str1.replaceAll(str2, "");
//		System.out.println(str1+" "+str2);
//		HashMap<String, Integer>map1=new HashMap<>();
		
//        TreeSet<Integer>ts=new TreeSet();
//        ts.add(1);
//        ts.add(3);
//        ts.add(5);
//        ts.add(7);
//       Iterator<Integer> itr=ts.descendingIterator();
//       while(itr.hasNext())
//       {
//    	   System.out.print(itr.next());
//       }
//		
//      li= ts.stream().filter(e1->e1<7).collect(Collectors.toList());
//      System.out.println(li);
//      ts.remove(100);
		PriorityQueue<Integer> pq=new PriorityQueue<>();
//		pq.add(1);
//		pq.add(2);
//		pq.remove();
//		System.out.println(pq);
		TreeMap<String, Integer>map1=new TreeMap<>();
		map1.put("Mangesh", 0);
		map1.put("Shubham", 1);
		String s=map1.higherKey("D");
		System.out.println(s);
		
		
	//	floor ->Greter than entries
	}
}
class Revision19Dec{

public static void main(String[] args) {
	ServiceX s=new ServiceX();
	s.iterate();
}
}

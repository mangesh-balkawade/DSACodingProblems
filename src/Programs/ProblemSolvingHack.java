package Programs;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class Result {

 /*
  * Complete the 'mostActive' function below.
  *
  * The function is expected to return a STRING_ARRAY.
  * The function accepts STRING_ARRAY customers as parameter.
  */

 public static List<String> mostActive(List<String> customers) {
 // Write your code here
 TreeMap<String,Integer> map=new TreeMap<>();
 for(String s:customers)
 {
     if(map.containsKey(s))
     {
         map.put(s, (map.get(s))+1);
     }
     else
     {
         map.put(s, 1);
     }
 }
 System.out.println(map);
 List<String>ret=new LinkedList<>();
 
 for(String s:map.keySet())
 {
	
     double per=(double)((double)((double)map.get(s)/customers.size()))*100;
     System.out.println(per);
     if(per>5)
     {
         ret.add(s);
     }
 }
 System.out.println(ret);
 return ret;

 }

}

public class ProblemSolvingHack {
public static void main(String[] args) {
	   Result r=new Result();
	     r.mostActive(List.of("A","B","A","C","A","D"));
	     
}
}

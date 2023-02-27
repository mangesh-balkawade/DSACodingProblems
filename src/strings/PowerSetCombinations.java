package strings;

public class PowerSetCombinations {
public static void main(String[] args) {
	String str="ABC";
	powerSet(str, 0, "");
}

static void powerSet(String str,int index,String temp)
{
	if(index==str.length())
	{
		System.out.println(temp);
		return ;
	}
	powerSet(str, index+1, temp+str.substring(index,index+1));
	powerSet(str,index+1,temp);
}
}

//             ABC

//          A        ""
 
//      AB   A     ""   B
//    ABC AB 

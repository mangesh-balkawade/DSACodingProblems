package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsX 
{
public static void main(String[] args) 
{
	ArrayList<Integer> li1=new ArrayList<>();
	li1.add(1);
	li1.add(2);
	li1.add(3);
	li1.add(4);
	li1.add(5);
	
//	List<Integer> li2=li1.stream().filter(ino1->ino1%2==0).collect(Collectors.toList());
//	
//	li2.forEach(e1->System.out.println(e1));
//	
//	List li3=li1.stream().map(e1->e1+2).collect(Collectors.toList());
//	
//	li3.forEach(e1->System.out.println(e1));
	
	Optional<Integer> i=li1.stream().min((e1,e2)->e1-e2);
	System.out.println(i.get());
	
	Optional<Integer> i1=li1.stream().max((e1,e2)->{
		if(e1>e2)
			return 1;
		else if(e1<e2)
			return -1;
		return 0;
	});
	System.out.println(i1.get());
	
	
}
}

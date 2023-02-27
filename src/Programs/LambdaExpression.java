package Programs;

interface i1
{
	int add(int ino1,int ino2);
}

interface i2
{
	void show(int ino1);
}

public class LambdaExpression 
{
 public static void main(String[] args) {
	 i1 lamda1=(ino1,ino2)-> ino1+ino2;
	 System.out.println(lamda1.add(1, 3));
	 
	 i2 lamda2=ino1->System.out.println(ino1);
	 lamda2.show(1);
	 
	 
}
  
}

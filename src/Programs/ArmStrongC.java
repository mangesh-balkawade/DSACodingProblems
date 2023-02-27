package Programs;

public class ArmStrongC {
	
	static boolean chkArmstrong(int no)
	{
		int temp1=no;
		int idigcnt=0;
		while(temp1>0)
		{
			idigcnt++;
			temp1=temp1/10;
		}
		
		int isum=0,power=1;
		 temp1=no;
		 
		 while(temp1>0)
		 {
			 int idigit=temp1%10;
			 for (int i=1;i<=idigcnt;i++)
			 {
				 power=power*idigit;
			 }
			 isum+=power;
			 power=1;
			 temp1=temp1/10;
			 
		 }
		 if (isum==no)
			 return true;
		 else
			 return false;
		
	}

	public static void main(String[] args) {
		System.out.println(chkArmstrong(152));
		
	}
}

package Programs;

class Demo1 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		System.out.println(Demo1.currentThread().getName());
		
	}
}

public class ThreadingDemo {
	public static void main(String[] args) throws InterruptedException
	{
		Demo1 obj1=new Demo1();
		obj1.setName("Thread 1");
		Demo1 obj2=new Demo1();
		obj1.setName("Thread 2");
		obj1.start();
		obj2.start();
		
		obj1.join();
	
		obj2.join();
		
		System.out.println("__________________________________________________________-");
		
	
			
	}

}

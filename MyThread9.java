import java.lang.*;

class Marvellous extends Thread	
{
	public void run()
	{
		System.out.println("Inside Thread : "+Thread.currentThread().getName());
		System.out.println("Thread priority is : "+Thread.currentThread().getPriority());
	}
}

class MyThread9
{
	public static void main(String a[])
	{
		System.out.println("Thread priority is : "+Thread.currentThread().getPriority());
		
		Marvellous mobj1 = new Marvellous();
		Thread t1 = new Thread(mobj1,"First");
		
		Marvellous mobj2 = new Marvellous();
		Thread t2 = new Thread(mobj2,"Secound");
		
		t1.setPriority(10);
		t2.setPriority(2);
		
		t1.start();
		t2.start();
	}
}
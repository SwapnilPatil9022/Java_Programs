import java.lang.*;

class Marvellous  extends Thread		
{
	public void run()
	{
		for(int i = 0; i<=1000; i++)
		{
		System.out.println("Inside Sheduled : "+Thread.currentThread().getName()+":"+i);
		}
	}
}


class MyThread4
{
	public static void main(String a[])
	{
		Marvellous mobj1 = new Marvellous();
		Thread t1 = new Thread(mobj1,"First");
		
		Marvellous mobj2 = new Marvellous();
		Thread t2 = new Thread(mobj2,"Secound");
		
		t1.start();
		t2.start();
	}
}
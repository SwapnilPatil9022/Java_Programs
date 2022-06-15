import java.lang.*;

class Base
{
	public int i;
	public int j;
	
	public Base()
	{
		System.out.println("inside Base constructor");
	}
	
	public void fun()
	{
		System.out.println("Inside base fun");
	}
	
	public void fun(int x)
	{
		System.out.println("Inside base fun with integer argument");
	}	
	
	public void gun()
	{
		System.out.println("Inside base gun");
	}
}

class Derived extends Base
{
	public int x;
	public int y;
	
	public Derived()
	{
		System.out.println("Inside derived constuctor");
	}
	
	public void sun()
	{
		System.out.println("Inside derived sun");
	}
}

class Inheritance1
{
	static
	{
		System.out.println("inside static block");
	}
	public static void main(String a[])
	{
		System.out.println("Inside main");
		Derived dobj = new Derived();
		dobj.fun();
		dobj.fun(11);
		dobj.gun();
		dobj.sun();
	}
}
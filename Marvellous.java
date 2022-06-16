import java.lang.*;

class Demo
{
	public int i;   //characteristics
	public int j;   //characteristics
	
	public Demo()				//Defoult constructor
	{
		this.i = 0;
		this.j = 0;
	}
	
	public Demo(int x, int y)        //parametarised constructor
	{
		this.i = x;
		this.j = y;
	}
	
	public void fun()						//behevoiurs
	{
		System.out.println("Inside fun");
	}
	
	public void gun()						//behevoiurs
	{
		System.out.println("Inside gun");
	}
}
class Marvellous
{
		public static void main(String arr[])		//Main-Entry point function
		{
			System.out.println("Inside main");				//Sop
	 		Demo obj = new Demo();					//new ha keywoerd aahe (Heap)
			obj.fun();	        //fun(obj
			obj.gun();			//gun(obj);
			System.out.println(obj.i);
			
			Demo objx = new Demo(11,21);	
			obj.fun();	        //fun(obj;
			obj.gun();			//gun(obj);
			System.out.println(objx.i);
		}
}


//every object is dynamic


//cpp madhy copy constuctor ani java madhy cloan constructor vapertat.

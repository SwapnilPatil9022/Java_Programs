import java.lang.*;

class Demo
{
	public int i;
	public final int j = 20;					//final value change hot nahi.
	public final int k;				//better in java 
	
	public Demo()					//Defoult constructor
	{
		this.i=10;
		this.k=30;
	}
	
	public Demo(int i,int k)			//parametarised constructor
	{
		this.i=i;
		this.k=k;
	}
	
	public void fun()
	{
		i++;		//allowed
	//	j++;		//not allowed
	//	k++;		//not allowed
	}
}

class  Final1
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.fun();
		System.out.println(obj.i);					//11
			System.out.println(obj.j);				//20
				System.out.println(obj.k);			//30
		Demo obj2 = new Demo(11,21);
		obj2.fun();
			System.out.println(obj2.i);				//12
				System.out.println(obj2.j);			//20
					System.out.println(obj2.k);		//21
		}
}
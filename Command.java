import java.lang.*;

class Command
{
	public static void main(String Arg[])	
	{
		System.out.println("First number is :"+Arg[0]);
		System.out.println("Secound number is :"+Arg[1]);
		
		int ans =Integer.parseInt(Arg[0]) + Integer.parseInt(Arg[1]);
		System.out.println("Addtion is: "+ans);
	}
}

//use for Run....
//javac Command.java
//java Command 10 11			.......yeth value type kara.
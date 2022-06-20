import java.lang.*;
import java.io.*;

class StringXX
{
	public static void main(String a[])
	{
		
		int i = 0;
		String str  = "Marvellous";
		
		System.out.println(str);				//Marvellous
		System.out.println(str.length());		//10
		
		for(i = 0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}

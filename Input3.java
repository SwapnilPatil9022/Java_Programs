import java.lang.*;
import java.io.*;

class Input3
{
	public static void main(String a[])throws IOException
	{
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter string");
		String str = bobj.readLine();
		
		System.out.println("Enter Integer");
		int no = Integer.parseInt(bobj.readLine());
		
		System.out.println("Enter float");
		float f = Float.parseFloat(bobj.readLine());
		
		System.out.println("Enter double");
		double d = Double.parseDouble(bobj.readLine());
		
			System.out.println("Enterd string is :"+str);
			System.out.println("Enterd integer is :"+no);
			System.out.println("Enterd float is :"+f);
			System.out.println("Enterd double is :"+d);
	}
} 
		

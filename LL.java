import java.lang.*;
import java.util.*;

class AL
{
	public static void main(String arg[])
	{
		LinkedList <String>obj = new LinkedList<String>();
		
		obj.add("Januray");
		obj.add("Frbruary");
		obj.add("March");
		obj.add("April");
		obj.add(2,"New");
		obj.add("May");
		obj.add("Marvellous");
		
		System.out.println("Arraylist contains: "+obj);
		System.out.println("Size is :"+obj.size());
		
		int i = 0;
		System.out.println("Elements are using for loop : ");
		for(int i = 0; i < obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
			str = (obj.get(i));
			if(str.equals("Marvellous"))
			{
				Cnt++;
			}
		
		System.out.println("Marvellous occurs at"+Cnt +"times in arrayList");
		
		if(obj.containce("April"))
		{
			System.out.println("Element is there");
		}
		
		int ret = obj.indexOf("April");
		System.out.println("Element is at:"+ret);
		
		System.out.println("Element is at index 3 is:"+obj.get(3));
		
		obj.remove(3);
		obj.remove("April");
		System.out.println("Update list is :"+obj);
	
		Iterator iobj = obj.iterator();
		while(iobj.hasnext())
		{
			System.out.println(iobj.next());
		}
		
		obj.clear();
		System.out.println("Updated list is :"+obj);
	}
}
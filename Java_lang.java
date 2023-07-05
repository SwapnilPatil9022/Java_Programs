import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
    ArrayList<String>obj = new ArrayList<String>();

    obj.add("January");
    obj.add("February");
    obj.add("March");
    obj.add("April");
    obj.add(2,"New");
    obj.add("May");

    System.out.println("ArrayList content : "+obj);
    System.out.println("Size of : "+obj.size());

    if(obj.contains("April"));
    {
      System.out.println("Element is there");
    }

    int ret = obj.indexOf("April");
    System.out.println("Element is at : "+ret);

    System.out.println("Element ata index 3 is : "+obj.get(3));

    obj.remove(3);
    obj.remove("April");
    System.out.println("Updated list is : "+obj);

    obj.clear();
    System.out.println("Updated list is : "+obj);
  }
}





















/*
import java.lang.*;

//templet<class T>
class Arithematic<T>
{
  public T Addition(T No1, T No2)
  {
    if((No1 instanceof Integer) && (No2 instanceof Integer))
    {
      return (T)(Integer)((Integer)No1 + (Integer)No2);
    }
    else if((No1 instanceof Float) && (No2 instanceof Float))
    {
      return (T)(Float)((Float)No1 + (Float)No2);
    }
    else if((No1 instanceof Double) && (No2 instanceof Double))
    {
      return (T)(Double)((Double)No1 + (Double)No2);
    }
    else
    {
      return null;
    }
  }
}
  
class Java_lang
{
    public static void main(String arg[])
    {
      Arithematic <Integer>obj = new Arithematic<Integer>();
      Integer ret = 0;
      ret = obj.Addition(10,11);
      System.out.println("Addition is:"+ret);
      
      Arithematic <Float>obj2 = new Arithematic<Float>();
      Float ret2 = 0.0f;
      ret2 = obj2.Addition(10.8f,11.4f);
      System.out.println("Addition is:"+ret2);
    
    }
}
  
*/  




















/*

// Genric in java

import java.lang.*;

class Arithmatic<T>
{
  public T Addition(T No1,T No2)
  {
    T Ans;
    Ans = No1 + No2;
    return Ans;
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    Arithmatic <Integer>obj = new Arithmatic<Integer>();
    Integer ret = 0;
    ret = obj.Addition(10,11);
    System.out.println("Addition is : "+ret);
  }
}

*/










/*
// Genric in java

import java.lang.*;

class Arithmatic
{
  public int Addition(int No1, int No2)
  {
    int Ans = 0;
    Ans = No1 + No2;
    return Ans;
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    Arithmatic obj = new Arithmatic();
    int ret = 0;
    ret = obj.Addition(10,11);
    System.out.println("Addition is : "+ret);
  }
}
*/













/*
import java.lang.*;
import java.sql.*;    //1

class Database
{
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");   //2

            Connection con = DriverManager.getConnection("jdbc::mysql://localhost:3306/shree","root","root"); //3

            Statement stmt = con.createStatement();   //4

            ResultSet rs = stmt.executeQuery("select * from student");    //5

            while(rs.next())    //6
            {
                System.out.println(rs.getInt(1) + " "+ rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
            }
            con.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured :"+obj);
        }
    }
}

*/








/*

import java.lang.*;
import java.net.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Server application is running...");
    String s1, s2;

    ServerSocket ss = new ServerSocket(1100);
    Socket s = ss.accept();

    System.out.println("Connection succesful");
  }
}


*/








/*

import java.lang.*;
import java.net.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Client application is running...");
    String s1,s2;

    Socket s = new Socket("localhost",1100);
  }
}


*/
















/*

// AWT in java 

import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter
{ 
  public Frame fobj;
  public Button bobj;
  public TextField tobj;

  public MarvellousFrame(String name)
  {
    fobj = new Frame(name);
    bobj = new Button("Marvellous");
    tobj = new TextField(); 

    fobj.setBounds(60,60,170,20);
    bobj.setBounds(110,130,90,20);

    fobj.add(bobj);
    fobj.add(tobj);

    fobj.setSize(600,600);
    fobj.setVisible(true);
    fobj.setLayout(null);

    fobj.addWindowListener(this);
  }

  public void windowClosing(WindowEvent obj)
  {
    System.exit(0);
  }
  public void actionPerformed(ActionEvent obj)
  {
    Demo dobj = new Demo();
    String str = new String();
    tobj.setText("Jay Ganesh...");
  }
}

class Java_lang
{ 
  public static void main(String str[])
  {
    MarvellousFrame mobj = new MarvellousFrame("PPA");
  }
}

*/





/*

import java.lang.*; 
import java.awt.*;
import java.awt.event.*;

class Demo
{
  public String DataDe()
  {
    return "Jay Ganesh...";
  }
}
class MarvellousFrame extends WindowAdapter implements ActionListener
{
  public Frame fobj;
  public Button bobj;
  public TextField tobj;
  
    public MarvellousFrame(String name)
    {
      fobj = new Frame(name);
      bobj = new Button("Marvellous");
      tobj = new TextField();
      
      tobj.setBounds(60,60,170,20);
      bobj.setBounds(110,130,90,20);
      
      fobj.add(bobj);
      fobj.add(tobj);
      
      fobj.setSize(600,600);
      fobj.setVisible(true);
      fobj.setLayout(null);
    
      bobj.addActionListener(this);
      fobj.addWindowListener(this);
    }
      public void windowClosing(WindowEvent obj)
      {
        System.exit(0);
      }
      
      public void actionPerformed(ActionEvent obj)
      {
        Demo dobj = new Demo();
        String str = new String();
        tobj.setText("Jay Ganesh...");
      }
}

class FrameDemo5
{
  public static void main(String arg[])
  {
    MarvellousFrame mobj = new MarvellousFrame("PPA");
  }
}


*/
 















/*

import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
  public Frame fobj;
  
    public MarvellousFrame(String name)
    {
      fobj = new Frame(name);
      fobj.setSize(600,600);
      fobj.setVisible(true);
      
      fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener extends WindowAdapter        //implements WindowListener
{
  public void windowClosing(WindowEvent obj)
    {
      System.exit(0);
    }
}

class FrameDemo4
{
  public static void main(String arg[])
  {
    System.out.println("Print the data on console");
    
    MarvellousFrame mobj = new MarvellousFrame("PPA");
  }
}

*/















/*

import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
  public Frame fobj;
  
    public MarvellousFrame(String name)
    {
      fobj = new Frame(name);
      fobj.setSize(600,600);
      fobj.setVisible(true);
      
      fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener implements WindowListener
{
  public void windowDeactivated(WindowEvent obj){}
  public void windowActivated(WindowEvent obj){}
  public void windowDeiconified(WindowEvent obj){}
  public void windowIconified(WindowEvent obj){}
  public void windowClosed(WindowEvent obj){}
  public void windowClosing(WindowEvent obj){}
  //public void windowOpened(WindowEvent obj){}
  {
    System.exit(0);
  }
  public void windowOpened(WindowEvent obj){}
}

class FrameDemo3
{
  public static void main(String arg[])
  {
    System.out.println("Print the data on console");
    
    MarvellousFrame mobj = new MarvellousFrame("PPA");
  }
}

*/













/*

import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
  public Frame fobj;

  public MarvellousFrame(String name)
  {
    fobj = new Frame(name);
    fobj.setSize(600,600);
    fobj.setVisible(true);

    fobj.addWindowListener(new MarvellousListener());
  }
}

class MarvellousListener implements WindowListener
{
  public void windowDeactivated(WindowEvent obj){}
  public void windowActivated(WindowEvent obj){}
  public void windowDeiconified(WindowEvent obj){}
  public void windowIconified(WindowEvent obj){}
  public void windowClosed(WindowEvent obj){}
  public void windowClosing(WindowEvent obj)
  {
    System.out.println("Inside windowClosing");
  }
  public void windowOpened(WindowEvent obj){}
}
class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Print the data on console");
    
    MarvellousFrame mobj = new MarvellousFrame("PPA");
  }
}

*/
















/*

import java.lang.*;
import java.awt.*;

class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Print the data on console");

    Frame fobj = new Frame("Marvellous");
    fobj.setSize(600,600);
    fobj.setVisible(true);
  }
}

*/




/*

// AWT (Abstract window toolkit) in java

import java.lang.*;
import java.awt.*;

class MarvellousFrame
{
  public Frame fobj;

  public MarvellousFrame(String name)
  {
    fobj = new Frame(name);
    fobj.setSize(600,600);
    fobj.setVisible(true);
  }
}
class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Print the data on console");

    MarvellousFrame mobj = new MarvellousFrame("PPA");
  }
}

*/














/*

// get Class in java

import java.lang.*;

class Demo
{}

class Java_lang
{
  public static void main(String Arg[]) 
  {
    Demo obj = new Demo();

    Class cref = obj.getClass();
    System.out.println("Class name of obj is :"+cref.getName());

    
    String str = "Marvellous";
    Class cref1 = str.getClass();

    System.out.println("Class name of str is : "+cref1.getName());
  }
}


*/
















/*

// Command line argument in java

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
//java Command 10 11      .......yeth value type kara.

*/













/*

import java.lang.*;

class Java_lang
{
  public static void main(String Arg[])
  {
    System.out.println("First number is : "+Arg[0]);
    System.out.println("Secound number is : "+Arg[1]);

    int ans = (Integer.parseInt(Arg[0]) + Integer.parseInt(Arg[1]));

    System.out.println("Addition is : "+ans);
  }
}


*/













/*

import java.lang.*;

class Employee
{
  public String name;
  public int Salary;

  public Employee(String str,int no)
  {
    this.name = str;
    this.Salary = no;
  }

  public String toString()
  {
    return ("Employee name is :"+name+" Having Salary "+Salary);
  }
}
class Java_lang
{
  public static void main(String arg[])
  {
    Employee eobj = new Employee("Swapnil",11000);
    System.out.println(eobj.toString());
  }
}


*/

















/*

import java.lang.*;

class Demo
{

}
class Java_lang
{
  public static void main(String arg[])throws Exception
  {
    String str1 = "Marvellous";
    String str2 = "Marvellous";
    String str3 = "Infosystems";
    Demo dobj = new Demo();

    System.out.println("Hashcode of str1 : "+str1.hashCode());
    System.out.println("Hashcode of str2 : "+str2.hashCode());
    System.out.println("Hashcode of str3 : "+str3.hashCode());
    System.out.println("Hashcode of dobj : "+dobj.hashCode());
  } 
}


*/


















/*

// clone concept in java (c,c++ madhy copy concept)

import java.lang.*;

class Employee implements Cloneable
{
  public int EID;
  public String Ename;
  public int ESalary;

  public Employee(int id,String str, int no)
  {
    this.EID = id;
    this.Ename = str;
    this.ESalary = no;
  }

  public Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }
}

class Java_lang
{
  public static void main(String[] args)throws Exception
  {
    Employee eobj = new Employee(11,"Swapnil",21000);   
    System.out.println("EID : "+eobj.EID + "Name : "+eobj.Ename +"Salary : "+eobj.ESalary);

    Employee eobjX = (Employee)eobj.clone();
    System.out.println("EID : "+eobjX.EID + "Name : "+eobjX.Ename +"Salary : "+eobjX.ESalary);
  }
}


*/















/*

import java.lang.*;

class Demo
{
  public int Arr[];

  public Demo(int size)
  {
    System.out.println("Allocating the resourcess in Constructor");
    this.Arr = new int[size];
  }

  protected void finalize()
  {
    System.out.println("Deallocating the resourcess in finalize");
    this.Arr = null;
  }
}
class Java_lang
{
  public static void main(String arg[])
  {
    Demo dobj = new Demo(10);
    dobj = null;
    System.gc();
    System.out.println("End of main");
  }
}

*/





















/*

import java.lang.*;
import java.util.*;

class Marvellous
{
  public int Arr[];
  
  public Marvellous(int size)
  {
    Arr = new int[size];
  }
  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter number");
    
    for(int i = 0; i<this.Arr.length; i++)
    {
    this.Arr[i] = sobj.nextInt();
    }
  }
  
  public void Display()
  {
    System.out.println("Data from array is:");
    for(int i = 0; i<this.Arr.length; i++)
    {
      System.out.println(this.Arr[i]);
    }
  }
  synchronized public void DisplayEven()
  {
    for(int i=0; i<this.Arr.length; i++)
    {
      if(this.Arr[i] % 2 == 0)
      {
        System.out.println(this.Arr[i]);
      }
    }
  }
}
class Demo extends Thread   
{
  public Marvellous mref;
  
  public Demo(Marvellous obj)
  {
    this.mref = obj;
  }
  
  public void run()   //Running state
  {
    this.mref.DisplayEven();
  }
}
class MyThread8
{
  public static void main(String a[])throws Exception
  {
    Marvellous mobj1 = new Marvellous(5);
    Marvellous mobj2 = new Marvellous(4);
    
    mobj1.Accept();
    mobj1.Display();
    
    mobj2.Accept();
    mobj2.Display();
    
    Demo dobj1 = new Demo(mobj1);
    Demo dobj2 = new Demo(mobj2);

    Thread t1 = new Thread(dobj1);
    Thread t2 = new Thread(dobj2);
    
    t1.start();
    t2.start();
    
    t1.join();
    t2.join();
    
    System.out.println("End of main Thread :");
  }
}


*/
















/*

import java.lang.*;
import java.util.*;

class Marvellous
{
  public int Arr[];
  
  public Marvellous(int size)
  {
    Arr = new int[size];
  }
  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter number");
    
    for(int i = 0; i<this.Arr.length; i++)
    {
    this.Arr[i] = sobj.nextInt();
    }
  }
  
  public void Display()
  {
    System.out.println("Data from array is:");
    for(int i = 0; i<this.Arr.length; i++)
    {
      System.out.println(this.Arr[i]);
    }
    System.out.println("----------------");
  }
  public void DisplayEven()
  {
    for(int i=0; i<this.Arr.length; i++)
    {
      if(this.Arr[i] % 2 == 0)
      {
        System.out.println(this.Arr[i]);
      }
    }
  }

}
class Demo extends Thread   
{
  public Marvellous mref;
  
  public Demo(Marvellous obj)
  {
    this.mref = obj;
  }
  
  public void run()   //Running state
  {
    this.mref.DisplayEven();
  }
}

class Java_lang
{
  public static void main(String a[])throws Exception
  {
    Marvellous mobj1 = new Marvellous(5);
    Marvellous mobj2 = new Marvellous(4);
    
    mobj1.Accept();
    mobj1.Display();
    
    mobj2.Accept();
    mobj2.Display();
    
    Demo dobj1 = new Demo(mobj1);
    Demo dobj2 = new Demo(mobj2);

    Thread t1 = new Thread(dobj1);
    Thread t2 = new Thread(dobj2);
    
    t1.start();
    t2.start();
    
    t1.join();
    t2.join();
    
    System.out.println("End of main Thread :");
  }
}



*/
















/*

import java.lang.*;
import java.util.*;

class Marvellous extends Thread
{
  public void run()
    {
      System.out.println("Inside Thread : "+Thread.currentThread().getPriority());
      System.out.println("Thread Property is : "+Thread.currentThread().getPriority());
    }
}


class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Thread Property is : "+Thread.currentThread().getPriority());

    Marvellous mobj = new Marvellous();
    Thread t1 = new Thread(mobj,"First");

    Marvellous mobj2 = new Marvellous();
    Thread t2 = new Thread(mobj2,"Secound");

    t1.setPriority(10);
    t2.setPriority(2);

    t1.start();
    t2.start();
  }
}


*/














/*


import java.lang.*;

class Demo extends Thread   
{
  public void run()   //Running state
  {
    for(int i = 0; i<10; i++)
    {
    System.out.println("Value of i :"+i);
    try
    {
    Thread.sleep(1000);
    } 
    catch(Exception obj)
    {}
    }
  }
}
class MyThread6
{
  public static void main(String a[])throws Exception
  {
    Demo obj1 = new Demo();
    Thread t1 = new Thread(obj1,"First");   //New state
    
    Demo obj2 = new Demo();
    Thread t2 = new Thread(obj2,"Secound");   //New state
    
    t1.start();
    
    t1.join();      // join methoad
    
    t2.start();
      //Dead state
  }
}

*/ 
 


















/*

import java.lang.*;

class Marvellous extends Thread
{
  public void run()
  {
    for(int i = 0; i < 10; i++)
    {
      System.out.println("Value of i : "+i);
      try
      {
        Thread.sleep(1000);
      }
      catch (Exception obj)
      {
        System.out.println("Exception occur");
      }
    }
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    Marvellous mobj1 = new Marvellous();
    Thread t1 = new Thread(mobj1,"First");

    mobj1.run();

    Marvellous mobj2 = new Marvellous();
    Thread t2 = new Thread(mobj2,"Secound");

    t1.start();
    t1.join();
    t2.start();
    // t2.join();  
  }
}

*/














/*

import java.lang.*;

class Marvellous extends Thread
{
  public void run()
  {
    System.out.println("Inside Thread : "+Thread.currentThread().getName());
    try
    {
      Thread.sleep(2000);
    }
    catch(Exception obj)
    {
      System.out.println("Exception occur");
    }
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    Marvellous mobj1 = new Marvellous();
    Thread t1 = new Thread(mobj1,"First");

    mobj1.run();

    Marvellous mobj2 = new Marvellous();
    Thread t2 = new Thread(mobj2,"Secound");

    t1.start();
    t2.start();
  }
}

*/
















/*


// Multitthreding in java
// 1. Multiprocessing
// 2. Multithreading 

import java.lang.*;

class Marvellous extends Thread
{
  public void run()
  {
    int i = 0;

    for(i = 0; i <= 100000000; i++)
      {
        System.out.println("Inside thread : "+Thread.currentThread().getName()+" : "+i);
      }
  }
}
class Java_lang
{
  public static void main(String arg[])
  {
    Marvellous mobj1 = new Marvellous();
    Thread t1 = new Thread(mobj1,"First");

    Marvellous mobj2 = new Marvellous();
    Thread t2 = new Thread(mobj2,"Secound");

    t1.start();
    t2.start();

    System.out.println("Inside thread : "+Thread.currentThread().getName());
  }
}


*/

















/*

// Multitthreding in java
// 1. Multiprocessing
// 2. Multithreading 

import java.lang.*;

class Marvellous implements Runnable
{
  public void run()
  {
    System.out.println("Inside thread : "+Thread.currentThread().getName());
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    Marvellous mobj1 = new Marvellous();
    Thread t1 = new Thread(mobj1,"First");

    Marvellous mobj2 = new Marvellous();
    Thread t2 = new Thread(mobj2,"Secound");

    t1.start();
    t2.start();
  }
}

*/















/*


import java.lang.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");

    if(str1 == str2)
    {
      System.out.pri ntln("string are same");
    }
    else
    {
      System.out.println("String are differnt");
    }

    if(str1.equals(str3))   //   if("Hello".equals("Hello"))
    {
      System.out.println("string same");
    }
    else
    {
      System.out.println("String differnt");
    }
  }
}


*/
















/*

import java.lang.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    String str1 = new String("Hello");
    StringBuffer str2 = new StringBuffer("Hello");
    StringBuilder str3 = new StringBuilder("Hello");

    System.out.println(str1);
    System.out.println(str1.length());

    System.out.println(str2);
    System.out.println(str2.length());

    System.out.println(str3);
    System.out.println(str3.length());

  }
}

*/
























/*

import java.lang.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    int i = 0;
    String str = "Marvellous";

    char arr[] = str.toCharArray();

    for (i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }
  }
}

*/















/*

import java.lang.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    int i = 0;
    String str = "Marvellous";

    System.out.println(str);
    System.out.println(str.length());

    for (i = 0; i < str.length(); i++)
    {
      System.out.println(str.charAt(i));
    }
  }
}

*/



















/*

// String in java

import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    // String litteral
    String str1 = "Hello";
    String str2 = "World";

    System.out.println(str1);    // Hello
    System.out.println(str1.length());    // 5

    String str3 = str1 + str2;
    System.out.println(str3);    // HelloWorld
    String str4 = "Hello";

    //  String objects
    String str5 = new String("Hello");
    String str6 = new String("World");
    String str7 = new String("Hello");
  }
}


*/
















/*

// Wrapper in java


import java.lang.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[])
  {
    int no = 11;

    Integer iobj = new Integer(11);

    int i = iobj;     //Unboxing

    Integer iobj2 = no;   // Boxing 

    System.out.println(no);
    System.out.println(iobj);
    System.out.println(i);
    System.out.println(iobj2);
  }
}

*/















/*

// Wrapper class in java (Bufferreader)

import java.lang.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[]) throws IOException
  {
    InputStreamReader iobj = new InputStreamReader(System.in);
    BufferedReader bobj = new BufferedReader(iobj);

    System.out.println("Enter String");
    String str = bobj.readLine();

    System.out.println("Enter Integer");
    int no = Integer.parseInt(bobj.readLine());

    System.out.println("Enter float");
    float f = Float.parseFloat(bobj.readLine());

    System.out.println("Enter Double");
    double d = Double.parseDouble(bobj.readLine());

    System.out.println("Enter Integer is : "+no);
    System.out.println("Enter float is : "+f);
    System.out.println("Enter double is : "+d);
  }
}


*/














/*


import java.lang.*;
import java.io.*;

class Java_lang
{
  public static void main(String arg[]) throws IOException
  {
    InputStreamReader iobj = new InputStreamReader(System.in);
    BufferedReader bobj = new BufferedReader(iobj);

    System.out.println("Enter your name");
    String name = bobj.readLine();

    System.out.println("Your name is : "+name);
  }
}

*/
















/*

import java.lang.*;
import java.util.*;

class AgeInvalid extends Exception
{
  public AgeInvalid(String str)
  {
    super(str);
  }
}
class Java_lang
{
  Scanner sobj = new Scanner(System.in)
  System.out.println("Enter your age : ");

  int age = sobj.nextInt();

  try
  {
    if(age < 18)
    {
      throw new AgeInvalid("Age is Below 18");
    }
  }
  catch(AgeInvalid obj)
  {
    System.out.println("Invalid catch");
    System.out.println(obj);
  }
}


*/


















/*

import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
      int i = 0;
      int j = 0;

      int arr[][] = new int[3][];
      try
      {
        arr[0][0] = 11;
        arr[0][1] = 21;
        arr[0][2] = 51;
        arr[1][0] = 101;
        arr[1][1] = 111;
        arr[1][2] = 121;
        arr[1][3] = 151;
        arr[1][4] = 200;
        arr[2][0] = 211;
        arr[2][1] = 251;
      }
      catch(java.lang.NullPointerException obj)
      {
        for (i = 0; i < arr.length; i++)      //Outer
        {   //  1         2           3 
          for(j = 0; j < arr[i].length; j++)       //Inner
          {
            System.out.println(arr[i][j]);
          }
        }
        System.out.println("Exception occured : "+obj);
      }
      final(Exception obj)
      {
        System.out.println("OK"+obj);
      }
  }
}

*/











/*

//Jagged Array

import java.lang.*;
import java.util.*;

class Array4
{
  public static void main(String arg[])
    {
      int i=0,j=0; 
      int arr[][] = new int[3][];

      arr[0][0] = 11;
      arr[0][1] = 21;
      arr[0][2] = 51;
      arr[1][0] = 101;
      arr[1][1] = 111;
      arr[1][2] = 121;
      arr[1][3] = 151;
      arr[1][4] = 200;
      arr[2][0] = 211;
      arr[2][1] = 251;
      
      for(i=0; i<arr.length; i++)
      {
        for(j=0; j<arr[i].length; j++)
        {
          System.out.println(arr[i][j]);
        }
      }
    }
}
          

*/
























/*
// Jagged Array


import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
    int i = 0, j = 0;
    int arr[][] = new int [3][];

    arr[0] = new int[3];
    arr[1] = new int[5];
    arr[2] = new int[2];

    for(i = 0; i < arr.length; i++)
    {
      for(j = 0; j < arr[i].length; j++)
      {
        System.out.println(arr[i][j]);
      }
    }  
    
  }
}



*/


















/*

import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
      int i = 0;
      int j = 0;

      int arr[][] = new int[2][3];

      arr[0][0] = 11;
      arr[0][1] = 21;
      arr[0][2] = 51;
      arr[1][0] = 101;
      arr[1][1] = 111;
      arr[1][2] = 121;

      for (i = 0; i < arr.length; i++)      //Outer
      {   //  1         2           3 
        for(j = 0; j < arr[i].length; j++)       //Inner
        {
          System.out.println(arr[i][j]);
        }
      }
  }
}




*/















/*

import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
    int iCnt = 0;

    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter number of element");

    int Size = sobj.nextInt();

    int Arr[] = new int [Size];

    System.out.println("Enter the element of array : ");
    for(iCnt = 0; iCnt < Arr.length; iCnt++)
    {
      Arr[iCnt] = sobj.nextInt();
    }

    System.out.println("Element if array are : ");
    for(iCnt = 0; iCnt < Arr.length; iCnt++)
    {
      System.out.println(Arr[iCnt]);
    }
  }
}

*/





















/*

// Loops and Array in java

import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
    int iCnt = 0;

    int arr[] = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40; 
    arr[4] = 40;

    System.out.println("Size of Array is : "+arr.length);
    System.out.println("Data by for loop");
    for(iCnt = 0; iCnt < arr.length; iCnt++)
    {
      System.out.println(arr[iCnt]);
    }

    System.out.println("Data by while loop");

    iCnt = 0;
    while(iCnt < arr.length)
    {
      System.out.println(arr[iCnt]);
      iCnt++;
    }

    System.out.println("Data by for each loop");
    for(int no:arr)
    {
      System.out.println(no);
    }
  }
}

*/













/*

try
{
  // Exception prone code
}
catch(ArithmeticException obj) // Specific catch
{}
catch(ArrayIndexOutOfBoundsException obj) //Specific catch
{}
catch(Exception obj) // Generic catch  // It should be at the end.

*/











/*

// Exception handling

import java.util.*;

class Exception2
{
  
  public static void main(String arg[])
  {
    int ans=0,no1=0,no2=0;
    Scanner sobj = new Scanner(System.in);
  
  System.out.println("Please enter first number:");
  no1 = sobj.nextInt();
  
  System.out.println("Please enter Secound number:");
  no2 = sobj.nextInt();
  
  try
  {
    ans=no1/no2;      //Exception prone code
  }
  catch(ArithmeticException obj)
  {
    System.out.println("Exception occured as :"+obj);
  } 
  finally
  {
    sobj.close();
  }
  
  System.out.println("Division is :"+ans);
  }
}

*/















/*


// Exception in java

import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
      int no1 = 0;
      int no2 = 0;
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the first number :");
      no1 = sobj.nextInt();

      System.out.println("Enter the secound number : ");
      no2 = sobj.nextInt();
 
    try
    {
      ans = no1 / no2;
    }
    catch(ArithmeticException obj)
    {
      System.out.println("Exception occured as : "+obj);
    }
    final
    {
      System.out.println("last : "+obj);
    }

    System.out.println("Division is :"+ans); 
   }
}


*/
















/*

// Scanner in java

import java.lang.*;
import java.util.*;

class Java_lang
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Please enter your name : ");
    String name = sobj.nextLine();

    System.out.println("Enter your age : ");
    int Age = sobj.nextInt();

    System.out.println("Enter your percentage : ");
    float percentage = sobj.nextFloat();

    System.out.println("Your name is : "+name);
    System.out.println("Your age is : "+Age);
    System.out.println("Your percentage is : "+percentage);
  }
}


*/













/*

import Demo.fun;
import Hello.gun;

class Java_lang
{
  public static void main(String arg[])
  {
    Hello obj = new Hello();
    Demo hobj = new hobj();

    obj.gun();
    hobj.fun();
  }
}


*?







/*

// Package in java

package Marvellous;

public class Java_lang
{
  public void fun()
  {
    System.out.println("Inside fun");
  }
}

*/












/*

// 1. One Class can extend another class
class Base
{}
class Derived extends Base
{}

/////////////////////////////////////////
// 2. One class can impliment one interface
interface Demo
{}
class Hello implements Hello
{}

////////////////////////////////////////////
// 3. one class implement more than one interface
interface Hello
{}
interface Demo
{}
class Marvellous implements Hello, Demo
{}

////////////////////////////////////////////
// 3. one interface can extends another interface
interface Hello
{}
interface Demo extends Hello
{}
class Marvellous extends Hello
{}

///////////////////////////////////////////////
// 6. one class can extend one class and implement one interface
class Demo
{}
interface Hello
{}
class Marvellous extends Demo implements Hello
{}
/////////////////////////////////////////////// 


*/

















/*


// Interface of java

import java.lang.*;

interface Circle
{
  float PI = 3.14f;   //public static final PI = 3.14f;
  
  float CalculateArea(float Radius);    //public abstract float CalculateArea(float Radius);
  float CalculateCircumfarence(float Radius);   //public abstract float CalculateCircumfarence(float Radius);
} 

class Area implements Circle
{
   public float CalculateArea(float Radius)
  {
    return (PI * Radius * Radius);
  }
    
  public float CalculateCircumfarence(float Radius)
  {
    return (2 * PI * Radius);
  }
} 

class Marvellous1
{
  public static void main(String arg[])
  {
    System.out.println("Value of PI is :"+Circle.PI);
    //Circle.PI = 3.14f;
    
    Area obj = new Area();
    float fRet = 0.0f;
    
    fRet = obj.CalculateArea(10.5f);
    System.out.println("Area is : "+fRet);
    
    fRet = obj.CalculateCircumfarence(10.5f);
    System.out.println("Circumfarence is : "+fRet);
  }
}


*/


















/*

import java.lang*.;

import Circle
{
  float PI = 3.14f;

  float CalculateArea(float Redius);
  float CalculateCircumfarance(float Redius);
}

class Area implements Circle
{
  public float CalculateArea(float Redius)
  {
    return (PI * Redius * Redius);
  }

  public float CalculateCircumfarance(float Redius)
  {
    return (2 * PI * Redius);
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    Area obj = new Area();
    float fRet = 0.0f;

    fRet = obj.CalculateArea(10.5f);
    System.out.println("Area is : "+fRet);

    fRet = obj.CalculateCircumfarance(10.5f);
    System.out.println("Area is : "+fRet);

  }
}

*/






 




 






 
/*

import java.lang.*;                   // Abstrct class

abstract class Demo
{
  public int i,j;

    public Demo()
    {
      System.out.println("Demo Constructor\n");   //concreate
    }
    public void fun()
    {
      System.out.println("Demo fun\n");       //concreate
    }
    public abstract void gun();     // Abstraction
}
class Hello extends Demo 
{
  public int x,y;

    public Hello()
    {
      System.out.println("Hello Constructor\n");
    }
    public void sun()
    {
      System.out.println("Demo sun\n"); 
    }
    public void gun()   // Abstraction
    {
      System.out.println("Hello gun\n");
    }
}
class Java_lang
{
  public static void main(String arg[])
  {
    // Demo dobj;
    Hello hobj = new Hello();
    hobj.fun();
    hobj.gun();
    hobj.sun();
  }
}

*/



















/*
// Abstract class

import java.lang.*;

abstract class RBI
{
  public int Balance;
  
  public RBI()
  {
    this.Balance = 0;
  }
  
  public void Credit(int Amount)
  {
    this.Balance = this.Balance + Amount;
  }
  
  public void Dedit(int Amount)
  {
    this.Balance = this.Balance - Amount;
  }
  
  public abstract int CalculateIntrest();
}

class SBI extends RBI
{
  public int AccountNumber;
  public int IFSC;
  
  public int CalculateIntrest()
  {
    return 6;
  }
}

class PNB extends RBI
{
  public int AccountNumber;
  public int IFSC;
  
  public int CalculateIntrest()
  {
    return 7;
  }
}

class  AbstractDemo
{
  public static void main(String a[])
    {
      PNB pobj = new PNB();
      SBI sobj = new SBI();
      
      pobj.Credit(1000);
      pobj.Dedit(200);
      
      System.out.println(pobj.Balance);     //800
    }
}
*/











/*
java.lang

final class System
{
  public static PrintStream out = new PrintStream();
}

class PrintStream
{
  public void println(String str)
  {

  }
}

System.out.println("Hello...");
*/














/*

// Final class in java

import java.lang.*;

final class Base
{
    public void fun()
    {
      System.out.println("Base fun");
    }
}
class Derived 
{
  public Base bobj = new Base();      // Composition

  public void gun()
  {
    System.out.println("Derived gun");
  }
}
class Java_lang
{
  public static void main(String arg[])
  {
    Derived dobj = new Derived();
    dobj.bobj.fun();
    dobj.gun();
  }
}

*/







/*

// Final class in java

import java.lang.*;

final class Demo
{
    
}
class Derived extends Demo
{
  
}
class Java_lang
{
  public static void main(String arg[])
  {
    
  }
}
*/




















/*

// Final METHOAD in java

import java.lang.*;

class Demo
{
    public void fun()
    {
      System.out.println("Demo fun\n");
    }
    public final void gun()
    {
      System.out.println("final Demo gun\n");
    }
}
class Derived extends Demo
{
  public void fun()
  {
    System.out.println("Derived fun\n");
  }
  // public void gun()
  // {
  //   System.out.println("Derived fun\n");
  // }
}
class Java_lang
{
  public static void main(String arg[])
  {
    Derived dobj = new Derived();
    dobj.fun();
    dobj.gun();
  }
}

*/












/*
// Final in java

import java.lang.*;

class Demo
{
    public int i;
    public final int j = 20;
    public final int k;

    public Demo()
    {
      this.i = 10;
      this.k = 30;
    }
    public Demo(int i,int k)
    {
      this.i = i;
      this.k = k;
    }
    public void fun()
    {
      i++;
      // j++;
      // k++;
    }
}
class Java_lang
{
  public static void main(String arg[])
  {
    Demo obj = new Demo();
    obj.fun();
    System.out.println(obj.i);
    System.out.println(obj.j);
    System.out.println(obj.k);

    Demo obj2 = new Demo(11,21);
    obj2.fun();
    System.out.println(obj2.i);
    System.out.println(obj2.j);
    System.out.println(obj2.k);
  }
}

*/







/*
import java.lang.*;

class Demo
{
  public int Add(int i, int j)
  {
    return i + j;
  } 
  public int Add(int i, int j, int k)
  {
    return i + j + k;
  } 
  public int Add(int i, int j, int k, int z)
  {
    return i + j + k + z;
  } 
}

class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Inside main");
    Demo obj = new Demo();
    int ret = 0;

    ret = obj.Add(10,20);
    System.out.println(ret);

    ret = obj.Add(10,20,30);
    System.out.println(ret);

    ret = obj.Add(10,20,30,40);
    System.out.println(ret);
  }
}
*/



















/*
import java.lang.*;

class Base
{
  public int i,j;

  public void fun()
  { System.out.println("Base fun"); }
  public void gun()
  { System.out.println("Base gun"); }
  public void sun()
  { System.out.println("Base sun"); }
}
class Derived extends Base
{
  public int x,y;

  public void fun()
  { System.out.println("Derived fun"); }
  public void sun()
  { System.out.println("Derived sun"); }
  public void run()
  { System.out.println("Derived run"); }
}

class Java_lang
{
  public static void main(String arg[])
  {
    // Base bobj = new Base();
    // Derived dobj = new Derived();

    Base bobj = new Derived();
    // Derived dobj2 = new Base();

    bobj.fun();
    bobj.gun();
    bobj.sun();
    // bobj.run();
  }
}
*/


















/*
import java.lang.*;

class Base
{
  public int i;
  public int j;

  public Base(int a, int b)
  {
    System.out.println("Inside Base Constructor");
    this.i = a;
    this.j = b;
  }
  public void fun()
  {
    System.out.println("Inside Base fun");
  }
}
class Derived extends Base
// Derived : public Base
{
  public int x;
  public int y;

  public Derived()
  {
    super(11,21);
    System.out.println("Inside derived Constructor");
    this.x = 30;
    this.y = 40;
  }
  public void sun()
  {
    System.out.println("Inside Derived sun");
    System.out.println(super.i);
    super.fun();
  }
}
class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Inside main");

    Derived dobj = new Derived();
    dobj.sun();
  }
}

*/




















/*
import java.lang.*;

class Base
{
  public int i;
  public int j;

  public Base()
  {
    System.out.println("Inside Base Constructor");
  }
  public void fun()
  {
    System.out.println("Inside Base fun");
  }
  public void fun(int x)
  {
    System.out.println("Inside base fun with interger argument");
  }
  public void gun()
  {
    System.out.println("Inside Base gun");
  }
}
class Derived extends Base
{
  public int x;
  public int y;

  public Derived()
  {
    System.out.println("Inside derived Constructor");
  }
  public void sun()
  {
    System.out.println("Inside Derived sun");
  }
}
class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Inside main");

    Derived dobj = new Derived();
    dobj.fun();
    dobj.fun(11);
    dobj.gun();
    dobj.sun();
  }
}
*/


















/*
import java.lang.*;

class Demo
{
  public int i;
  public int j;
  public static int k;

  static
  {
    System.out.println("Inside Static block");
    k = 11;
  }

  public Demo()
  {
    System.out.println("Inside Constructor");
    this.i = 0;
    this.j = 0;
  }

  public void fun()
  {
    System.out.println("Inside non static fun");
    System.out.println(this.i);
    System.out.println(this.j);
    System.out.println(this.k);
  }

  public static void gun()
  {
    System.out.println("Inside static gun");
    System.out.println(k);
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    Demo.gun();   

    Demo obj = new Demo();
    obj.fun();

    // System.out.println(obj.i);
    // System.out.println(obj.j);
  }
}
*/



  
















/*
import java.lang.*;

class Demo
{
  public int i;
  public int j;

  public Demo()
  {
    this.i = 0;
    this.j = 0;
  }

  public Demo(int x, int y)
  {
    this.i = x;
    this.j = y;
  }

  public void fun()
  {
    System.out.println("Inside fun");
  }

  public void gun()
  {
    System.out.println("Inside gun");
  }
}

class Java_lang
{
  public static void main(String arg[])
  {
    System.out.println("Inside main");
    Demo obj = new Demo();
    obj.fun();
    obj.gun();
    System.out.println(obj.i);

    Demo objx = new Demo(11,12);
    objx.fun();
    objx.gun();
    System.out.println(objx.i);
  }
}
*/













/*
import java.lang.*;

class Java_lang
{
	public static void main(String arg[])
	{
		System.out.println("Jay Ganesh...");
	}
}
*/























/*
class Java_lang{

  public static void main(String[] args) {
    
    int first = 10;
    int second = 20;

    // add two numbers
    int sum = first + second;
    System.out.println(first + " + " + second + " = "  + sum);
  }
}

*/
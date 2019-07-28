import java.util.*;
import java.io.*;

class vect
{
	public static void main(String arg[]) throws IOException{
		stuff r = new stuff();
		r.getdata();
		r.asker();
	}
}

class stuff
{	
	Vector v = new Vector();
	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader bfr = new BufferedReader(isr);

	void getdata() throws IOException
	{
		int n,i;
		System.out.print("Enter number of elements to insert: ");
		n = Integer.parseInt(bfr.readLine());
		for (i=0;i<n;i++)
		{
			System.out.print("Enter element: ");
			v.add(bfr.readLine());
		}
		System.out.println();
	}
	
	void asker() throws IOException{
		int i,quit=0,ch;	
		System.out.println("Enter 1 for adding an element, 2 to delete, 3 to print all elements");
		while (quit != 1)
		{
			System.out.println();
			System.out.print("Enter choice: ");
			ch = Integer.parseInt(bfr.readLine());
			switch (ch)
			{
				case 1:
					insert();
					break;
				case 2:
					delete();
					break;
				case 3:
					print();
					break;
			}
			System.out.print("Press 1 to exit and 0 to continue: ");
			quit = Integer.parseInt(bfr.readLine());
		}
	}
	
	void insert() throws IOException
	{
		int pos;
		System.out.print("Enter position you want to insert element at: ");
		pos = Integer.parseInt(bfr.readLine());
		System.out.print("Enter the element: ");
		v.add(pos,bfr.readLine());
	}
	
	void delete() throws IOException
	{
		System.out.print("Enter Values to delete: ");
		v.remove(bfr.readLine());
	}
	
	void print()
	{
		int i;
		for (i=0;i<v.size();i++)
		{
			System.out.println("\t"+v.get(i));
		}
	}
}


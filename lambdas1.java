import java.util.*;

interface abc
{
    public void compare();

}

public class Main

{
	
public static void main(String[] args)
 {

		Scanner sc=new Scanner(System.in);

		int n;

		String[] a = new String[100];

		n=sc.nextInt();

		for(int i=0;i<n;i++)

		{

		    a[i]=sc.next();

		}

		abc obj=()->{

		    for(int j=0;j<n;j++)

		    {

		        if(a[j].startsWith("a")==true && a[j].length()<=3)

		        {

		            System.out.println(a[j]);

		        }

		       // System.out.println(a[j]);

		    }

		};

		obj.compare();

	}

}
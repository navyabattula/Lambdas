import java.util.*;

class abc
{

    public void compare(String[] a,int n)

    {


        for(int i=0;i<n;i++)

        {

            StringBuilder sb=new StringBuilder(a[i]);

            if(a[i].equals(sb.reverse().toString()))

            System.out.println(a[i]);

        }

    }

}

public class Main1

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

		abc obj=new abc();

		obj.compare(a,n);

	}

}
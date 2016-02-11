
package newjava;
import java.util.*;
public class MYProgram {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String i= sc.next();
		int k= i.length();
		for(int j=0;j<i.length()/2;j++,k--)
		{
			char a=i.charAt(j);
			char b=i.charAt(k-1);
			if(a==b)
			{}
		}
	}

}

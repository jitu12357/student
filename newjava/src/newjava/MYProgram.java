
package newjava;
import java.util.*;
public class MYProgram {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String i= sc.next();
		int k= i.length();
		k--;
		for(int j=0; ;j++,k--)
		{
			char a=i.charAt(j);
			char b=i.charAt(k);
			if(a==b)  
			{
				if(j>=k)
				{
					System.out.println("this is");
					break;
				}
			}
			else{
				System.out.println("Not a palendrom");
				break;
			}
		}
	}

}

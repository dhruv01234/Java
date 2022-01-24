/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codenium1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		while(t!=0){
		    t -= 1;
		int n = s.nextInt();
		int a[] = new int[n];
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i=0;i<n;i++){
		    a[i] = s.nextInt();
		    set1.add(a[i]);
		}
		if(n<12){
		   System.out.println("no");
		}
		else if(set1.size()>12){
		    System.out.println("no");
		}
		else if(n>=12 && set1.size()<=12){
		    System.out.println("yes");
		}
		
		
	}
	}
}

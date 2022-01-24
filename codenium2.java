/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codenium2
{
	public static void main (String[] args) throws java.lang.Exception,java.lang.ClassCastException
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		    t -= 1;
		    String s1,s2;
		    s1 = s.next();
		    s2 = s.next();
		    char st1[] = s1.toCharArray();
		    char st2[] = s2.toCharArray();
		    Set<Character> set1 = new HashSet<Character>();
		    Set<Character> set2 = new HashSet<Character>();
		    for(int i=0;i<s1.length();i++){
		        set1.add(st1[i]);
		    }
		    for(int i=0;i<s2.length();i++){
		        set2.add(st2[i]);
		    }
		    set2.removeAll(set1);
			if(set2.size()==0){
				System.out.println(-1);
			}
			else{
            char[] ans = new char[set2.size()];
            int i=0;
		    for(char c:set2){
		        ans[i] = c;
		        i += 1;
		    }
		    Arrays.sort(ans);

		    for(i=0;i<set2.size();i++){
		    System.out.print(ans[i]);
		    }
		    System.out.println();
		}
		}
	}
}

/*Input specification
The input file consists of several blocks of data. Each block starts with the number of candy packets N(1<= N <=10000) followed by N integers (each less than 1000) in separate lines, giving the number of candies in each packet. After the last block of data there is the number -1.

Output specification
The output file should contain one line with the smallest number of moves for each block of data. One move consists of taking one candy from a packet and putting it into another one. If it is not possible to have the same number of candies in each packet, output the number -1.

Input file:
5
1
1
1
1
6
2
3
4
-1

Output file:
4
-1
*/

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int[] a;int sum=0,cnt=0,res=0;
		while(t!=-1){
			sum=0;
			cnt=0;
			res=0;
			a=new int[t];
			for(int i=0;i<t;i++){
				a[i]=in.nextInt();
				sum+=a[i];
			}
			int v=sum/t;
			for(int i=0;i<t;i++){
				if(v>a[i]){
					res+=(v-a[i]);
					cnt+=(v-a[i]);
				}
				else if(v<a[i]){
					cnt+=(v-a[i]); 
				}
				
			}
			if(cnt==0)
				System.out.println(res);
			else
				System.out.println("-1");
				t=in.nextInt();
			
		}
		
	}
}

/*Input
The first and only line of the standard input contains one integer N (1 <= N <= 10000).

Output
The first and only line of the standard output should contain a single integer equal to the number of different rectangles that Byteman can form using his squares.

Example
For the input data:

6
the correct result is:

8
*/

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int res=0;
		for(int i=1;i<=(int)Math.sqrt(n);i++){
			res+=(n/i-i+1);
		}
		System.out.print(res);
		
	}
}

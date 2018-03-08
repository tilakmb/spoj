/*Input
The first line of the input contains an integer t, the number of test cases. t test cases follow.

Each test case consists of 3 lines:

The first line contains a single integer N (1 <= N <= 1000).
The second line contains N integers separated by single spaces denoting the hotness levels of the men.
The third line contains N integers separated by single spaces denoting the hotness levels of the women.
All hotness ratings are on a scale of 0 to 10.

Output
For each test case output a single line containing a single integer denoting the sum of the hotness bonds for all pairs that MMDS has proposed.

Input:
2
2
1 1
3 2
3
2 3 2
1 3 2

Output:
5
15
*/

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int m[]=new int[n];
            int w[]=new int[n];
            int sum=0;

            for(int s=0;s<n;s++){
                m[s]=in.nextInt();
            }

            for(int j=0;j<n;j++){
                w[j]=in.nextInt();
            }

            Arrays.sort(m);
            Arrays.sort(w);
            for(int k=0;k<n;k++)
            {
                sum+=m[k]*w[k];
            }
            System.out.println(sum);
        }
	}
}

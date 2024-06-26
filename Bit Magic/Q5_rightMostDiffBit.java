//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here !  
        int xor = m ^ n;
        if (xor == 0) {
            return -1;
        }
        int position = 1;
        while ((xor & 1) == 0) {
            xor >>= 1;
            position++;
        } 
        return position;     
    }
}



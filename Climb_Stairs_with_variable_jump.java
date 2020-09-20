//You are on the 0th step and required to climb to the top.
//You are given n numbers, where ith element's value represents - till how far from the step you 
//could jump to in a single move.  
//You can of course jump fewer number of steps in the move.
//You are required to print the number of different paths via which you can climb to the top.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int[] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=arr[i] && i+j<dp.length;j++){
                dp[i]+=dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }

}

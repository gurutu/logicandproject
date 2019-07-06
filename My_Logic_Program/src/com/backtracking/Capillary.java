package com.backtracking;

import java.io.*;
import java.util.*;


public class Capillary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            
            int Q = Integer.parseInt(br.readLine().trim());
            String[] arr_L = br.readLine().split(" ");
            long[] L = new long[Q];
            for(int i_L=0; i_L<arr_L.length; i_L++)
            {
            	L[i_L] = Long.parseLong(arr_L[i_L]);
            }
            
            String[] arr_R = br.readLine().split(" ");
            long[] R = new long[Q];
            for(int i_R=0; i_R<arr_R.length; i_R++)
            {
            	R[i_R] = Long.parseLong(arr_R[i_R]);
            }

            long[] out_ = solve(A, R, L);
            System.out.print(out_[0]);
            for(int i_out_=1; i_out_<out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static long[] solve(int[] l1, long[] R, long[] L){
    	int length=l1.length;
    	for (int j = 0; j < L.length; j++) {
    		long index1=L[j],index2=R[j];
    		int count=0;
    		long sum =0;
    		for(long i=index1;i<=index2;i++) {
    			if(i%length==0) {
    				sum+=l1[length-1];
    				count=0;
    			}else {
    				sum+=l1[count];
    				count+=1;
    			}
    		}
    		R[j]=sum;
		}
        return R;
    }
}
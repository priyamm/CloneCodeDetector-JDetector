package com.priyam.antlr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class  LongestCommonSubstring
{
  
   public String lcs(String str1, String str2)
   {
       int l1 = str1.length();
       int l2 = str2.length();

       int[][] arr = new int[l1 + 1][l2 + 1];
       int len = 0, pos = -1;

       for (int x = 1; x < l1 + 1; x++)
       {
           for (int y = 1; y < l2 + 1; y++)
           {
               if (str1.charAt(x - 1) == str2.charAt(y - 1)&&str1.charAt(x - 1)!='{'&&str1.charAt(x - 1)!='('&&str1.charAt(x-1)!=')'&&str1.charAt(x-1)!='}' )
               {
                       arr[x][y] = arr[x - 1][y - 1] + 1;
                       if (arr[x][y] > len)
                       {
                           len = arr[x][y];
                           pos = x;
                       }               
               }
               else
                   arr[x][y] = 0;
           }
       }        

       return str1.substring(pos - len, pos);
   }

   /** Main Function **/
   public static String check(String s, String t)
   {    
       
       Test3 ob=new Test3();
       String str1 = s;
       String str2 = t;
       
       

       LongestCommonSubstring obj = new LongestCommonSubstring(); 
       String result = obj.lcs(str1, str2);

       return result;
   }
   
   public String lcss(String str1, String str2){
	   
	   String a = str1;
       String b = str2;
       String result="",x="",y="";
       
       int stringTokenizer = new StringTokenizer(" " +a + " ", ")").countTokens()-1;
       int stringTokenizer2 = new StringTokenizer(" " +a + " ", "(").countTokens()-1;
       int stringTokenizer3 = new StringTokenizer(" " +b + " ", ")").countTokens()-1;
       int stringTokenizer4 = new StringTokenizer(" " +b + " ", "(").countTokens()-1;
       System.out.println("\nstringTokenizer = " + stringTokenizer);
       int M = a.length()-stringTokenizer*2;
       int N = b.length()-stringTokenizer3*2;
       System.out.println("\nstringTokenizer = " + stringTokenizer);
       for(int i=0;i<a.length();i++){
    	   if(a.charAt(i)=='('||a.charAt(i)==')'){
    		continue;
    	   }
    	   else
    		   x+=(a.substring(i,i+1));
    	   
       }
       System.out.println(x.length());
       System.out.println("\nstringTokenizer = " + a.length());
       for(int i=0;i<b.length();i++){
    	   if(b.charAt(i)=='('||b.charAt(i)==')'){
       		continue;
       	   }
       	   else
       		   y+=(b.substring(i,i+1));
       }
       // opt[i][j] = length of LCS of x[i..M] and y[j..N]
       int[][] opt = new int[M+1][N+1];
       
       System.out.println("\nstringTokenizer = " + x);
       // compute length of LCS and all subproblems via dynamic programming
       for (int i = M-1-20; i >= 0; i--) {
           for (int j = N-1-20; j >= 0; j--) {
               if (x.charAt(i) == y.charAt(j))
                   opt[i][j] = opt[i+1][j+1] + 1;
               else 
                   opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
           }
       }

       // recover LCS itself and print it to standard output
       int i = 0, j = 0;
       while(i < M -20&& j < N-20) {
           if (x.charAt(i) == y.charAt(j)) {
               result+=(x.charAt(i));
               i++;
               j++;
           }
           else if (opt[i+1][j] >= opt[i][j+1]) i++;
           else                                 j++;
       }
	return result;
	   
   }
}
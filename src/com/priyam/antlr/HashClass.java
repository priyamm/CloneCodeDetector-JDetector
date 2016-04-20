package com.priyam.antlr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Woodstox;

public class HashClass {
	
	
	public static void main(String args)throws Exception{
		
		
	}
	public static HashMap<Integer, String> mapping(String x){
		HashMap<Integer, String> hashcode = new HashMap<Integer, String>();
		int i,length,wordlen;
		String str[],code;
		str=x.split("\n");
		length=str.length;
		
		for(int a=0;a<length;a++){
			code="";
			if(str[a].equals("{")||str[a].equals("}"))
				continue;
			wordlen=str[a].replaceAll("[{,},\\s]", "").length();
			//System.out.print(wordlen+"-"+str[a]);
			while(wordlen>0){
				code+=(char)(wordlen%27+65);
				wordlen-=26;
			}
			hashcode.put(a, code);
			//System.out.println(str[a]+a+code);
		}
		
		Iterator<Integer> keySetIterator = hashcode.keySet().iterator();
		while(keySetIterator.hasNext()){ 
			Integer key = keySetIterator.next(); 
			//System.out.println("key: " + key + " value: " + hashcode.get(key)+str[key]); 
			
			}
		return hashcode;
	}
	
	
	public static HashMap<String, ArrayList<Integer>> LCS(HashMap<Integer, String> hashcode1,HashMap<Integer, String> hashcode2){
		
		 	int M = hashcode1.size();
	        int N = hashcode2.size();

	        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
	        int[][] opt = new int[M+1][N+1];
	        ArrayList<Integer> list = new ArrayList();
	        ArrayList<Integer> list2 = new ArrayList();
	        
	        // compute length of LCS and all subproblems via dynamic programming
	        for (int i = M-1; i >= 0; i--) {
	            for (int j = N-1; j >= 0; j--) {
	                if (hashcode1.get(i).equals(hashcode2.get(j)))
	                    opt[i][j] = opt[i+1][j+1] + 1;
	                else 
	                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
	            }
	        }
	        //System.out.println("LCS-"+M+N);

	        // recover LCS itself and print it to standard output
	        int i = 0, j = 0;
	        while(i < M && j < N) {
	        	//System.out.println(hashcode1.get(i)+"*"+hashcode2.get(j));
	            if (hashcode1.get(i).equals(hashcode2.get(j))) {
	            	//System.out.println(hashcode1.get(i)+"*"+hashcode2.get(j));
	              // System.out.print(i);
	            	
	            	list.add(i);
	            	list2.add(j);
	                i++;
	                j++;
	                
	            }
	            else if (opt[i+1][j] >= opt[i][j+1]) i++;
	            else                                 j++;
	        }
		
	        HashMap<String, ArrayList<Integer>> hashmap = new HashMap<String, ArrayList<Integer>>();
	        hashmap.put("file1", list);
	        hashmap.put("file2", list2);
	        return hashmap;
	}
	
	public static HashMap<String, ArrayList<Integer>> exactclones(){
		
	
		
		return null;
		
	}
	
}

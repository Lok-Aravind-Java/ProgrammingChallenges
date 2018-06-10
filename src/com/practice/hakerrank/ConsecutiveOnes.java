package com.practice.hakerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConsecutiveOnes {


	  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int number = s.nextInt();
	        int count=0,zero=0;
	        
	        String str = Integer.toBinaryString(number);
	        System.out.println(str);
	        char[] c = str.toCharArray();
	        List<Integer> ls = new ArrayList<>();
	          
	        
	        for(char c1 : c){
	        
	        if(c1=='0'){
	        		zero++;
	        	}
	        	
	        }
	        
	        
	        for(int i = 0 ,j=0; i< c.length ; i++){
	        	
	        
	        if(c[i]=='1'){
	          
	        	if(j==zero){
	        		
	        		for(int z = i; i<c.length;z++){
	        			
	        			count++;
	        		}
	        		
	        		ls.add(count);
	        		
	        		break;
	        	}
	        count++;
	            
	        }else if(c[i]=='0'){
	        	
	        	ls.add(count);
	        	count = 0;
	        	j++;
	        }
	        
	        }
	        
	         
	        Collections.sort(ls);
	        Collections.reverse(ls);
	        
	      
	        System.out.println(ls.get(0));
	    }

}

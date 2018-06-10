package com.exam.hxaware;

import java.util.Scanner;

public class Problem1 {
    
	 public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	        
	        int i = s.nextInt();
	       
	        for(int j = 0 ; j< i ; j++){
	            
	        String st = s.next();  
	        char[] c = st.toCharArray();
	        String str="";
	        String str1="";
	       
	        
	            for(int z = 0 ; z<c.length ; z++){
	                
	                if(z%2==0){
	                str = str + c[z];
	                }
	                else{
	                   str1 = str1 + c[z];  
	                    
	                }
	                 
	            }
	            System.out.println(str + " " +str1);
	    }
	        
	        
	        
	    }
	
}

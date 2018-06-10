package com.practice.hakerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RansomNote {

	
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int m = in.nextInt();
	        int n = in.nextInt();
	        String magazine[] = new String[m];
	        ArrayList<String> str1 = new ArrayList<>();
	        ArrayList<String> str2 = new ArrayList<>();
	        
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next();
	            str1.add(magazine[magazine_i]);
	        }
	        
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	            str2.add(ransom[ransom_i]);
	        }
	       
	         /* ArrayList<String> str1 = (ArrayList<String>) Arrays.asList(magazine);
	         ArrayList<String> str2 = (ArrayList<String>) Arrays.asList(ransom);*/
	         
	         
	        
	        boolean condition = true;
	       
	       
	        for(int i = 0 ;i< ransom.length ; i++){
	        	
	        	 if(str1.contains(ransom[i])){
	        		str1.remove(i);
	        		
		               
		               System.out.println(str1.contains(ransom[i]));
		            }else{
		                condition = false;
		            break;
		            }
	        }
	      
	        
	        if(condition){
	           System.out.println("Yes"); 
	        }else{
	            System.out.println("No");
	        }
	    }
}
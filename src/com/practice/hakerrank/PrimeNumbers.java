package com.practice.hakerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {


public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
         
        int T = s.nextInt();
        
        for(int i = 0 ; i < T ; i++){
        	loops(s.nextInt());
        }
      
            
        }
        
	

    public static void loops( int n ){
    	
    	 
          boolean tf = false;
          for(int i = 2 ; i <= n/2 ; i++){
              
              if(n%i == 0){
                  
                  tf=true;
                  break;
                  
              }
          }
          
          
          if(tf){
              System.out.println("Not prime");
          }else{
               System.out.println("Prime");
          }
          
    	
    }
    
}



//Other solution
/*
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
     int vall= scan.nextInt();
       int val=0;
   while(vall-- > 0){
    val = scan.nextInt();
for(int i=2; i<=val/i; i++){
  if(val%i==0) val=1;

}

        
if(val==1) System.out.println("Not prime");
else System.out.println("Prime");
  	
   }
   
   

  }
  
*/
package com.practice.hakerrank;

import java.util.Scanner;

public class Factorial {


    static int sum;
    
    static int factorial(int n) {
        
    	
        if(n>1){
        	
        sum= n*factorial(n-1);
       
        }else{
            return n;
        }
       // return sum;
		return sum;
        
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
  
    }

}

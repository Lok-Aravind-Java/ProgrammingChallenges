package com.practice.hakerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayDimension {

	 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[][] arr = new int[6][6];
		
		
		for(int i =0 ; i < arr.length; i ++){
			for(int j = 0 ; j< arr[i].length; j++){
				
				arr[i][j]= s.nextInt();
				
			}
		}

		hourGlass(arr);
	}

	
	public static void hourGlass(int[][] arr){
		
		
		List<Integer> ls = new ArrayList<>();
		int sum =0;
		
		
		for(int i =0;i<arr.length-2;i++){
			for(int j =0;j<arr[i].length-2; j++){
				
			sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2])+(arr[i+1][j+1])+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
				
				ls.add(sum);
			}
			
			
			
		}
		
		
		Collections.sort(ls);
		Collections.reverse(ls);
		System.out.println(ls.get(0));
	}
	
}

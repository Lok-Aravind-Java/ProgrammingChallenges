package com.exam.smallpathmatrix;

import java.util.ArrayList;

public class LowestPathTwo {

	private static int TotalSum = 0;
	private static ArrayList<Integer> list;
	
	
	public static void findLowestPath(int[][] array,int row,int column){
	
		list = new ArrayList<>();
		 list.add(0);
	     TotalSum = array[0][0];
		
	 
	for(int j = 0,i = 0 ; j< column-1; j++){
		
		if(i<(row-1)){
	if(array[i][j+1]<array[i+1][j+1]){
		
		TotalSum += array[i][j+1];
		list.add(i);
		
	}else{
		
		TotalSum += array[i+1][j+1];
		list.add(i+1);
		i++;
	}
		
		}else{
			
			
			TotalSum += array[i][j+1];
			list.add(i);
			
		}
	}
	
	
	
	if(array[0].length==list.size()){
		
		System.out.println("Yes");
		
	}else{
		
		System.out.println("No");
	
	}
	
	
	System.out.println("Lowest cost : " + TotalSum);

	list.stream().map(s -> s+1).forEach(p -> System.out.print(p));
	

	}
}

package com.exam.smallpathmatrix;

import java.util.ArrayList;

public class FindLowestPath {

	private static int TotalSum = 0;
	private static ArrayList<Integer> list;
	
	public static void findLowestPath(int[][] array,int row,int column){
		
		 list = new ArrayList<>();
		 list.add(0);
	     TotalSum = array[0][0];
		
		
		for(int j = 0,i = 0 ; j< column-1; j++){
			
			
			if(TotalSum>=50){
			     
				list.remove(list.size()-1);
			     TotalSum -= array[i][j]; 
			     
				break;
			}
			
			
			if(i>0  && i<(row-1) ){
			
			if(array[i][j+1]<array[i+1][j+1] && array[i][j+1]<array[i-1][j+1]){
				
				TotalSum += array[i][j+1];
				list.add(i);
				
			}else if(array[i+1][j+1] < array[i-1][j+1]){
				
				TotalSum += array[i+1][j+1];
				list.add(i+1);
				i++;
			}else{
			
				
				TotalSum += array[i-1][j+1];
				list.add(i-1);
				i--;
			}
			
			}else{
				
			if(i==0){	
	         if(array[i][j+1]<array[i+1][j+1] && array[i][j+1]<array[row-1][j+1]){
				
	        	TotalSum += array[i][j+1];
				list.add(i);
				
			}else if(array[i+1][j+1] < array[row-1][j+1]){
				
				TotalSum += array[i+1][j+1];
				list.add(i+1);
				i++;
				
			}else{
				
				TotalSum += array[row-1][j+1];
				list.add(row-1);
				i=row-1;
				
			}
			}   
			else{

				 if(array[i][j+1]<array[0][j+1] && array[i][j+1]<array[i-1][j+1]){
						
		        	  TotalSum += array[i][j+1];
					list.add(i);
					
				}else if(array[0][j+1] < array[i-1][j+1]){
					
					TotalSum += array[0][j+1];
					list.add(0+1);
					i=0;
				}else{
					
					TotalSum += array[i-1][j+1];
					list.add(i-1);
					i--;
				}
			
			}
				
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
	
	
	public void ifEqual(int a,int b,int i){
		
		if(a==b){
			
			TotalSum += a;
			list.add(i);
		
		}
		
		
	}
	
}

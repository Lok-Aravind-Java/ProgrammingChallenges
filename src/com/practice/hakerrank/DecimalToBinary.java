package com.practice.hakerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
	
		int number,i=0;
		List<Integer> binary = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		
		String abc = Integer.toBinaryString(number);
		System.out.println(abc);
		
		while(number!=0){
			
			binary.add(number%2);
			number = number/2;
			i++;
		}
		
		
		ListIterator<Integer> ls = binary.listIterator();
		
		System.out.println("The binary number for the given number is :");
		while(ls.hasNext()){
			
			System.out.print(ls.next()+" ");
		}

	}

}

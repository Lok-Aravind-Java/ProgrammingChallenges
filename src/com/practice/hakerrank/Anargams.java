package com.practice.hakerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anargams {

	public static int numberNeeded(String first, String second) {

		
		
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
			
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
			
		}
	
		return result;
		
		
		
		
		////////////////////////////////////////////////OR
		/*char[] a = first.toCharArray();
		char[] b = second.toCharArray();
		int count=0;
		int a1=a.length;
		int b1 = b.length;
		for(int i = 0 ; i<a.length ; i ++){
			for(int j = 0 ; j <b.length ; j++){
			
				if(a[i]==b[j]){
					count++;
					
				}
			}
			
		}
		
	
		
		
       return a1+b1-(2*count);*/
		
	///////////////////////////////////////////OR	
		
		/*char[] a = first.toCharArray();
		char[] b = second.toCharArray();

		List<Character> ls1 = new ArrayList<>();
		List<Character> ls2 = new ArrayList<>();

		for (char x : a) {
			ls1.add(x);
		}
		for (char x : b) {
			ls2.add(x);
		}

		List<Character> ls = new ArrayList<>();
		ls.addAll(ls1);

		ls1.removeAll(ls2);

		ls2.removeAll(ls);

		ls1.addAll(ls2);

		return ls1.size();*/
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}

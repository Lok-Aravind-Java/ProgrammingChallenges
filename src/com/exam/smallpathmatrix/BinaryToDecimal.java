package com.exam.smallpathmatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class BinaryToDecimal {
	public static int countBits(int a)
	{
		int count = 0;
		while (a != 0)
		{
			if ((a & 1) != 0)
			{
				count += 1;
			}
	//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right 
			//shift operator since the left operand was not confirmed to be of an unsigned type, 
			//but you should review whether the logical right shift operator (>>>) is more appropriate:
			a = a >> 1;
		}
		return count;
	}
	
	private static void sortBySetBitCount(int[] arr, int n)
	{
		int setbitcount = 0;
		HashMap<Integer,Integer> newHash = new HashMap<Integer,Integer>();
		for (int i = 0; i < n; i++)
		{
			setbitcount = countBits(arr[i]);
			newHash.put(arr[i], setbitcount);
		}
		
		Set<Entry<Integer, Integer>> entries = newHash.entrySet();
		System.out.println("HashMap before sorting entries ");
		for(Entry<Integer, Integer> entry : entries){
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
			}
		
		Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer,Integer>>() { 
			@Override 
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2)
			   {
				 Integer v1= e1.getValue(); 
				 Integer v2 = e2.getValue(); 
				return v1.compareTo(v2); 
			   } 
			};
			
			List<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(entries); 
			Collections.sort(listOfEntries, valueComparator); 
			LinkedHashMap<Integer, Integer> sortedByValue = new LinkedHashMap<Integer, Integer>(listOfEntries.size());
			for(Entry<Integer, Integer> entry : listOfEntries)
			{ 
				sortedByValue.put(entry.getKey(), entry.getValue()); 
			}

			System.out.println("HashMap after sorting entries by values "); 
			Set<Entry<Integer, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
			for(Entry<Integer, Integer> mapping : entrySetSortedByValue)
			{ 
				System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); 
			}
	}
	
	public static void main(String args[])
   {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int n = arr.length;
		sortBySetBitCount(arr, n);
	}
}

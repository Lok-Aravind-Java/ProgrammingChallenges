package com.practice.hakerrank;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
      
	 Stack<Character> sta = new Stack<>() ;
	Queue<Character> que = new ArrayDeque<Character>();
	
	void pushCharacter(char c){
		sta.push(c);
		System.out.println(sta);
	}
	
	void enqueueCharacter(char c){
	    que.offer(c);	
	    System.out.println(que);
	}
	
	char popCharacter(){
	 return sta.pop();
	}
	
	char dequeueCharacter(){
	 return que.poll();
		}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Palindrome p = new Palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}

package com.exam.hxaware;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StacksQueues {

	public static void main(String[] args) {
		Stack<Character> sta = new Stack<Character>();
		
		sta.push('r');
		sta.push('a');
		sta.push('c');
		sta.push('e');
		
		System.out.println(sta.firstElement());
		System.out.println(sta.pop());
		sta.pop();
		sta.pop();
		sta.pop();
		
		
		Queue<Character> que = new ArrayDeque<Character>();
	
		
		que.add('r');
		que.add('a');
		que.add('c');
		que.add('e');
		que.add('a');
		
		System.out.println(que.poll());
		
	}

}

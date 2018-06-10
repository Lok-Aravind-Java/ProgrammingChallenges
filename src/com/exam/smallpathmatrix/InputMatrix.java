package com.exam.smallpathmatrix;

import java.util.Scanner;

public class InputMatrix {

	private static Scanner s;
	public static int[][] matrix;
	public static int row=0,column=0;
	
	public static void input() {
		s = new Scanner(System.in);

		System.out.println("Enter the row length");
		row = s.nextInt();

		System.out.println("Enter the column length");
		column = s.nextInt();

		matrix = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.println("Enter the element " + i + "" + j);
				matrix[i][j] = s.nextInt();

			}

		}

	}

}

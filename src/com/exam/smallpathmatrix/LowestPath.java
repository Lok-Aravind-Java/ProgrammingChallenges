package com.exam.smallpathmatrix;

public class LowestPath {

	public static void main(String[] args) {

		InputMatrix.input();
	
		DisplayMatrix.display(InputMatrix.matrix);
		
		FindLowestPath.findLowestPath(InputMatrix.matrix,InputMatrix.row,InputMatrix.column);
	
	}

	
}

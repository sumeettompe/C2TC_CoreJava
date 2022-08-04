package com.cg.fandamental;

public class PreeAndPostDecrerement {

	public static void main(String[] args) {
		int numA=15;
		int numB=5;
		int numC=1;
		
		numC = --numC + numB--;//-1 
		System.out.println(numA);
		System.out.println(numB);
		System.out.println(numC);

	}

}

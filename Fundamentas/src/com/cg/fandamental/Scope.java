package com.cg.fandamental;

public class Scope {

	public static void main(String[] args) {
	int outer=2;
	{
		int inner=2;
		System.out.println("inner variable=" +inner);
		System.out.println("outer variable=" +outer);
	}
		int inner=4;
		System.out.println("inner variable=" +inner);
		System.out.println("outer variable=" +outer);
	}

}

package com.cg.fandamental;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lang="java";
		if(lang=="hin&eng") {
		if(lang=="python")
			System.out.println("language is python");
		}
		else if(lang=="c++") {
			System.out.println("lang is c++");
		}
		else if(lang=="java") {
			System.out.println("lang is java");
		}
		else {
			System.out.println(lang);
		}
	}

}

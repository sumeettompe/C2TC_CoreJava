package com.cg.fandamental;

public class SwitchStringExample {

	public static void main(String[] args) {
		String currentDay ="thursday";
		
		switch(currentDay) {
		case  "monday":
		case "tuesday":
		case "wednesday":
			System.out.println("boring day");
		case "thursday":
			System.out.println("getting better");
			break;
			
		case "friday":
			System.out.println("much better");
		case "saturday":
		case "sunday":
			
		}

	}

}

package com.cg.fandamental;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit =10;
		int sum=0;
		for(int i=1;i<=limit;i++) {
			if(i%4==0) {
				continue;
				
			}
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}

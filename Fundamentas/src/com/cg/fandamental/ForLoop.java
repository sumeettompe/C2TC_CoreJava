package com.cg.fandamental;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length =3;
		int key=1;
		int k=0;
		out:{
			for(int i=0;i<length;i++) {
				in:{
					for(int j=0;j<length;j++) {
						if(i==key) {
							break in;
						}
						k=k+1;
					}
				}
			}
		}
		System.out.println(k);
	}

}

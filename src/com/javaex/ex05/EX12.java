package com.javaex.ex05;

public class EX12 {
		//cmd 사용
	public static void main(String[] args) {
		/*
		for(int i=0; i<args.length; i++) {
			
			System.out.println(args[i]);
			for(int i=0; i<args.length; i++) {
			*/	
				
			
		
		
		System.out.println("-------------------------");
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/
		System.out.println("-------------------------");
		
			
			
		
		for(int i=0; i<args.length; i++) {
			
		if(args[i].equals("-v")) {
			System.out.println("버전 3.0");
			
		}
		if(args[i].equals("-d")) {
			System.out.println("만든날짜:2025-04-28");
		}
		if(args[i].equals("-n")) {
		System.out.println("만든사람: 임유빈");
	   }
		
	  }
	}

}

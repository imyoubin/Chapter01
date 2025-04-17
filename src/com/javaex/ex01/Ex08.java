package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		double var01 = 5/4;     // 1.25-->1.0
		System.out.println(var01);	//5.4 ==>정수형+정수형==>정수형
		
		double var02 = (double)5/4;  //5.0/4=>1.25
		System.out.println(var02);	//5.0/4.0=1.25	
		
		double var03 = 5/(double)4;	//5/4.0=>1.25
		System.out.println(var03);	//5.0/4.0=1.25
		
		double var04 = (double)5/(double)4; //5.0/5.0=>1.25
		System.out.println(var04);
		
		int var05 = (int)1.3+(int)1.8;	//1+1=>2
		System.out.println(var05);
		
		double var06 = (int) 1.3+1.8;	 //1+1.8 => 1.0+1.8
		System.out.println(var06); 		//1.3+.18 ==>3.1 ==>3.0(x)
		
				
		
		}


}

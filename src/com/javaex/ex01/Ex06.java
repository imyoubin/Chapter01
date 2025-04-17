package com.javaex.ex01;

public class Ex06 {
public static void main(String[] args) {
	//자동형변환	
   //다른 자료형(정수+실수)	
	double var01 = 2+3.5;  //	2-->2.0으로 변환됨
	System.out.println(var01);
	
	double var02 = 3.0+6;       //6-->6.0으로 변환됨
	System.out.println(var02);
	
	//
	long var03 = 1234;
	float var04  = 1.5f;
	
	float result01 = var03 + var04;
	System.out.println(result01);
	
	//강제형변환	
	float var05 = 111.6456f;
	int var06 = (int)var05;   //111.6456f---->111로 변환됨
	System.out.println(var06);
	
	//확대강제변환<byte(1)-->int(4)	
	byte var07 = 10;
	System.out.println(var07);
	
	int result02 = (int)var07; 
	System.out.println(result02);
	
	//축소강제변환 int(4)-->byte(1)정상
	int var08 = 10;
	System.out.println(var08);
	
	byte result03 = (byte)var08;
	System.out.println(result03);
	
	//축소강제변환 int(4)-->byte(1)비정상
	int var09 = 203029770;
	System.out.println(var09);
	
	byte result04 = (byte)var09;
	System.out.println(result04);
	
//	강제형변환 -->실수=>정수
	double var10 = 5.57;
	System.out.println(var10);	
	int result05 = (int)var10;
	System.out.println(result05); //소수점 없어짐 이용할수 있음 
	
//	강제형변환 -->정수 =>실수
	int var11 = 7;
	System.out.println(var11);	
	double result06 = (double)var11;
	System.out.println(result06);
	
	
	
	}

}

package com.collection;

public class JavaFun {
	static int fun(){
//		 static int x=0;
		int x=0;
		try{
			int a=5;
			int y = 5/0;
			System.out.println(y);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
			
			
		 return ++x;
	}
	public static void main(String[] args) {
		System.out.println(fun());
	}
}

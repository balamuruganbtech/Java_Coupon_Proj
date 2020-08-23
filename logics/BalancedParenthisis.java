package com.logics;

public class BalancedParenthisis {
	
	static String s="()()(((())))(){}{(({}))}[][]({[]})";
	
	static int bracketCounter=0;
	static boolean bracket = true;
	
	static int curlCounter=0;
	static boolean curlBraces = true;
	
	static int squareCounter=0;
	static boolean squareBraces = true;
	
	static boolean balanced = true;

	public static boolean isSquareBraces(char ch){
		if(ch=='[' || ch==']' ){
			return true;
		}
		return false;
	}
	
	public static boolean isOpenSquareBraces(char ch){
		if(ch=='['){
			return true;
		}
		return false;
	}
	
	public static boolean isCloseSquareBraces(char ch){
		if(ch==']'){
			return true;
		}
		return false;
	}
	
	public static boolean isNotParenthisis(char ch){
		if(ch=='(' || ch==')' ||ch=='{' || ch=='}' ||ch=='[' || ch==']'){
			return true;
		}
		return false;
	}
	
	public static boolean isCurlBraces(char ch){
		if(ch=='{' || ch=='}' ){
			return true;
		}
		return false;
	}
	
	public static boolean isOpenCurlBraces(char ch){
		if(ch=='{'){
			return true;
		}
		return false;
	}
	
	public static boolean isCloseCurlBraces(char ch){
		if(ch=='}'){
			return true;
		}
		return false;
	}
	public static boolean isBracket(char ch){
		if(ch=='(' || ch==')' ){
			return true;
		}
		return false;
	}
	
	public static boolean isOpenBracket(char ch){
		if(ch=='('){
			return true;
		}
		return false;
	}
	
	public static boolean isCloseBracket(char ch){
		if(ch==')'){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(!isNotParenthisis(ch)){
				balanced = false;
				break;
			}
			if(isBracket(ch)){
				if(isOpenBracket(ch)){
					bracketCounter++;
					bracket=false;
				}
				if(isCloseBracket(ch)){
					if(bracketCounter==0){
						bracket=false;
						break;
					}
					bracketCounter--;
					bracket=true;
				}
			}
			if(isCurlBraces(ch)){
				if(isOpenCurlBraces(ch)){
					curlCounter++;
					curlBraces=false;
				}
				if(isCloseCurlBraces(ch)){
					if(curlCounter==0){
						curlBraces=false;
						break;
					}
					curlCounter--;
					curlBraces=true;
				}
			}
			
			if(isSquareBraces(ch)){
				if(isOpenSquareBraces(ch)){
					squareCounter++;
					squareBraces=false;
				}
				if(isCloseSquareBraces(ch)){
					if(squareCounter==0){
						squareBraces=false;
						break;
					}
					squareCounter--;
					squareBraces=true;
				}
			}
		}
		if(balanced && (bracketCounter==0&&bracket) && (curlCounter==0&&curlBraces) && (squareCounter==0&&squareBraces)){
			System.out.println("Balanced");
		}else{
			System.out.println("Un-Balanced");
		}
	}
}

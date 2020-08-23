package com.misc;

public class CustomClassLoader extends ClassLoader{
	public CustomClassLoader(ClassLoader cl){
		 super(cl);
         System.out.println("Hi there");
         System.exit(0);
	}
}

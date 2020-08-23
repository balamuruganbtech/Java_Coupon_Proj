package com.logics;

import java.util.LinkedList;
import java.util.Scanner;

public class GrandChildren {

	Scanner scan=new Scanner(System.in);
	int n,count=0;
	LinkedList<String> f=new LinkedList<String>();
	String p;
	void input() {
		System.out.println("Enter the number of pairs--->");
		n=scan.nextInt();
		String[][] set=new String[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				if(j==0)
					System.out.print("Enter the child name-"+(i+1)+"===>");
				if(j==1)
					System.out.print("Enter the parent name-"+(i+1)+"===>");
				set[i][j]=scan.next();
			}
		}
		System.out.println("\nCombination of child and their parent:\n");
		for(int i=0;i<n;i++) {
			System.out.println("<"+set[i][0]+","+set[i][1]+">");
		}
		System.out.println("\nEnter the parent name for finding no.of.grandchildren--->");
		p=scan.next();
		check(set,p);
	}
	void check(String[][] set,String g) {
		for(int a=0;a<n;a++) {
			if(set[a][1].equalsIgnoreCase(g))
				f.add(set[a][0]);
		}
		for(int j=0;j<f.size();j++){
			 for(int i=0;i<n;i++){ 
			     if(set[i][1].equalsIgnoreCase(f.get(j))) 
				     count++;
			 }
		}
		System.out.println("\nNumber of Grandchildren is "+count);
	}
	public static void main(String[] args) {
		GrandChildren gc=new GrandChildren();
		gc.input();
	}


}

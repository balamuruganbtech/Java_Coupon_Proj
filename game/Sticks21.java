package com.game;

import java.util.Scanner;

public class Sticks21 {

	static Scanner scan = new Scanner(System.in);
	static int n = 21;
	static int temp = 0;
	static int clue = 5;

	static void playerPlay() {
		System.out.println("Pick the Sticks");
		temp = scan.nextInt();
		n -= temp;
		if (n > 0){
			System.out.println("Player picks "+temp);
			computerPlay();
		}
		else{
			System.out.println("You lose the game !!! ");
		}
	}

	static void computerPlay() {
		temp = clue - temp;
		n -= temp;
		System.out.println("Computer picks "+temp);
		System.out.println("Total Sticks = "+n);
		playerPlay();
	}

	public static void main(String[] args) {
		System.out.println("================== GAME STARTS ================== ");
		playerPlay();
	}

}

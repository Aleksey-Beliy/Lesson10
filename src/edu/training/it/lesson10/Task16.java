package edu.training.it.lesson10;

public class Task16 {

	public static void main(String[] args) {

		int[][] mas = new int[6][6];

		initArray(mas);

		printArray(mas);

	}

	public static void initArray(int[][] mas) {

		int n = 1;

		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = n * (n + 1);
			n++;
		}
	}

	public static void printArray(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}
	}
}
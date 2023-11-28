package edu.training.it.lesson10;

public class Task13 {

	public static void main(String[] args) {
		int[][] mas = new int[6][8];

		initArray(mas);

		printArray(mas);
	}

	public static int[][] initArray(int mas[][]) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + 1;
				} else {
					mas[i][j] = mas[i].length - j;
				}
			}
		}
		return mas;
	}

	public static void printArray(int mas[][]) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%d] ", mas[i][j]);
			}
			System.out.println();
		}
	}
}
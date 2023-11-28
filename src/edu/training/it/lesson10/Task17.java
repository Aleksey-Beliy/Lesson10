package edu.training.it.lesson10;

public class Task17 {

	public static void main(String[] args) {

		int[][] mas = new int[6][6];

		initArray(mas);

		printArray(mas);
	}

	public static void initArray(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 || i == mas.length - 1 || j == 0 || j == mas.length - 1) {
					mas[i][j] = 1;
				} else {
					mas[i][j] = 0;
				}
			}
		}

	}

	public static void printArray(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.printf("[%d] ", mas[i][j]);
			}
			System.out.println();
		}
	}
}

package ua.lviv.lgs;

public class Homework_1 {

	public static void main(String[] args) {

		/*
		 * byte a = 1; short b = 2; int c = 4; long d = 8L;
		 * 
		 * float e = 1.3F; double f = 2.7;
		 * 
		 * boolean g = true; char h = '\u0041';
		 */

		System.out.println("byte = " + Byte.MAX_VALUE + " is the maximum value");
		System.out.println("byte = " + Byte.MIN_VALUE + " is the minimum value");
		System.out.println(" ");
		System.out.println("short = " + Short.MAX_VALUE + " is the maximum value");
		System.out.println("short = " + Short.MIN_VALUE + " is the minimum value");
		System.out.println(" ");
		System.out.println("int = " + Integer.MAX_VALUE + " is the maximum value");
		System.out.println("int = " + Integer.MIN_VALUE + " is the minimum value");
		System.out.println(" ");
		System.out.println("long = " + Long.MAX_VALUE + " is the maximum value");
		System.out.println("long = " + Long.MIN_VALUE + " is the minimum value");
		System.out.println(" ");
		System.out.println("float = " + Float.MAX_VALUE + " is the maximum value");
		System.out.println("float = " + Float.MIN_VALUE + " is the minimum value");
		System.out.println(" ");
		System.out.println("double = " + Double.MAX_VALUE);
		System.out.println("double = " + Double.MIN_VALUE);
		System.out.println(" ");
		// System.out.println("boolean = " + Boolean.BYTES); //не працює чомусь ;(
		// System.out.println("boolean = " + Boolean.MAX_VALUE); //не працює чомусь
		// System.out.println(" ");
		System.out.println("char = " + Character.BYTES + " bytes");
		System.out.println("char = " + Character.SIZE + " bites");
		System.out.println(" ");

		int[] values = { 5, 4, 7, 1, -1, 29, 309, 205, 47, 0, -9, 23, 287, 104 }; // початковий масив
		int min = values[0]; // змінна, яка зберігає мінімальне значення при кожній ітерації циклу for вона
								// перевіряється та при необхідності оновлюється
		int max = values[0]; // змінна, яка зберігає максимальне значення при кожній ітерації циклу for вона
								// перевіряється та при необхідності оновлюється
		for (int i = 1; i < values.length; i++) { // цикл for
			int value = values[i]; // на початку присвоює значення другої комірки [1] масиву values
			if (value < min) { // порівнює значення другої комірки та першої комірки масиву values
				min = value; // якщо значення другої комірки менше значення першої комірки, тоді значення
								// другої комірки присвоюється змінній min
			} else if (value > max) {// порівнює значення другої комірки та першої комірки масиву values
				max = value; // якщо значення другої комірки більше значення першої комірки, тоді значення
								// другої комірки присвоюється змінній max
			}
		}
		System.out.println(min + " is min value");
		System.out.println(max + " is max value");

	}

}

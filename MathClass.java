import java.util.Scanner;

public class MathClass {
	public static void main(String [] args) {
	int x = x_input();
	int y = y_input();

	System.out.println("Math.pow = " + a(x,y));
	System.out.println("Math.sqrt = " + b(x));
	System.out.println("Math.abs = " + c(x));
	System.out.println("Math.random = " + d(x));
	System.out.println("Math.max = " + e(x,y));
	System.out.println("Math.min = " + f(x,y));
	System.out.println("Math.round = " + g(x));
	System.out.println("Math.ceil = " + h(x));
	System.out.println("Math.floor = " + i(x));
	}
	public static double a(int x, int y) {
		return Math.pow(x,y);
	}
	public static double b(int x) {
		return Math.sqrt(x);
	}
	public static double c(int x) {
		return Math.abs(x);
	}
	public static double d(int x) {
		return Math.random();
	}
	public static int e(int x, int y) {
		return Math.max(x,y);
	}
	public static int f(int x, int y) {
		return Math.min(x,y);
	}
	public static int g(int x) {
		return Math.round(x);
	}
	public static double h(int x) {
		return Math.ceil(x);
	}
	public static double i(int x) {
		return Math.floor(x);
	}
	public static int x_input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a x value:");
		return keyboard.nextInt();
	}
	public static int y_input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a y value:");
		return keyboard.nextInt();
	}
}

package zadatak;
import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite znak operacije(+, -, *, /):");
		char operation = unos.next().charAt(0);
		int a = 24;
		int b = 12;
		int x;
		if(operation == '+') {
			x = a + b;
			System.out.print("Rezultat je:"+x);
		}else if(operation == '-') {
			x = b - a;
			System.out.print("Rezultat je:"+x);
		}else if(operation == '*') {
			x = a * b;
			System.out.print("Rezultat je:"+x);
		}else if(operation == '/') {
			x = a / b;
			System.out.print("Rezultat je:"+x);
		}else {
			System.out.print("Uneli ste ne postojeci znak!");
		}

	}

}
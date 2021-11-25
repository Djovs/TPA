import java.util.Scanner;
public class Triangulo {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira o valor de um lado: ");
		a = in.nextInt();
		System.out.println("Insira o segundo valor: ");
		b = in.nextInt();
		System.out.println("Insira o terceiro valor: ");
		c = in.nextInt();
		if (a>b+c || b>a+c || c>a+b) {
			System.out.println("N�o � um tri�ngulo.");
		}else if (a==b && b==c) {
			System.out.println("� um tri�ngulo equil�tero.");
		}else if (a !=b && a!=c) {
			System.out.println("� um tri�ngulo escaleno.");
		}else {
			System.out.println("� um tri�ngulo is�sceles.");
		}
		
	}
}

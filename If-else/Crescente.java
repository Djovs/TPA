import java.util.Scanner;
public class Crescente {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		int a, b, c;
		System.out.println("Insira o n�mero desejado: ");
		a=in.nextInt();
		System.out.println("Insira o segundo n�mero desejado: ");
		b= in.nextInt();
		System.out.println("Insira o �ltimo n�mero desejado: ");
		c= in.nextInt();
		if (a<b && b<c) {
			System.out.println("A ordem crescente �: "+a+","+b+","+c+"");
		}else if (a<c && c<b) {
			System.out.println("A ordem crescente �: "+a+","+c+","+b+"");
		}else if (b<a && a<c) {
			System.out.println("A ordem crescente �: "+b+","+a+","+c+"");
		}else if (b<c && c<a) {
			System.out.println("A ordem crescente �: "+b+","+c+","+a+"");
		}else if (c<a && a<b) {
			System.out.println("A ordem crescemte �: "+c+","+a+","+b+"");
		}else {
			System.out.println("A ordem crescente �: "+c+","+b+","+a+"");
			
		}
		
	}

}

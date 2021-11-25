import java.util.Scanner;
public class Imc {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		double kg, al, imc;
		System.out.println("Insira seu peso: ");
		kg = in.nextDouble();
		System.out.println("Insira sua altura: ");
		al = in.nextDouble();
		imc = kg/(al*al);
		System.out.println("Seu IMC � de: "+imc+"");
		if (imc<=18.5 && imc<25) {
			System.out.println("Excesso de magreza.");
		}else if (imc>=25 && imc<30) {
			System.out.println("Peso normal.");
		}else if (imc>30 && imc<35) {
			System.out.println("Excesso de peso.");
		}else if (imc>=35 && imc<40) {
			System.out.println("Grau de obesidade I.");
		}else if (imc>=40) {
			System.out.println("Grau de obesidade II.");
		}else {
			System.out.println("Grau de obesidade III.");
				
			}
		}
		
	}


import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		int ansc,aat,idade;
		System.out.println("Insira seu ano de nascimento: ");
		ansc = in.nextInt();
		System.out.println("Insira o ano atual: ");
		aat = in.nextInt();
		idade = aat-ansc;
		System.out.println("Sua idade é "+idade+" anos.");
		if (idade<10) {
			System.out.println("Criança");
		}else if (idade>=10 && idade<18) {
			System.out.println("Adolescente");
		}if (idade>=18 && idade<60) {
			System.out.println("Adulto");
		}else if(idade>60) {
			System.out.println("Idoso");
		}
	}

}

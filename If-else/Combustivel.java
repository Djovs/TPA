import java.util.Scanner;
public class Combustivel {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		float km, ct, gm;
		System.out.println("Insira com o Km percorrido:");
		km = in.nextFloat();
		System.out.println("Insira a capacidade do tanque:");
		ct = in.nextFloat();
		gm = km/ct;
		System.out.println("O consumo do combustível foi de:"+gm+" litros.");
		if (gm>=10) {
			System.out.println("Econômico");
		}else
			System.out.println("Não econômico");
		}
	}



import java.util.Scanner;
public class Conversor {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		double metros, km;
		System.out.println("Digite o valor a ser convertido em quilômetros: ");
		metros = leia.nextDouble();
		km = metros/1000;
		System.out.println("\n O resultado convertido é " +km+ " km"); 
		leia.close();  //Que felicidade ver isso funcionando mds T-T
	}

}

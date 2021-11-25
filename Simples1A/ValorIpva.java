import java.util.Scanner;
public class ValorIpva {
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double vi,ipva;
		System.out.println("Digite o pre�o do ve�culo: ");
		vi = leia.nextDouble();
		ipva = (4*vi)/100;
		System.out.println("\nO IPVA �: R$" +ipva);
		leia.close();
	}

}

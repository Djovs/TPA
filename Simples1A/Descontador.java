import java.util.Scanner;
public class Descontador {
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		float pp, pd, desc, vd;
		System.out.println("Digite o pre�o do produto: ");
		pp = leia.nextFloat();
		System.out.println("Digite o desconto desejado: ");
		pd = leia.nextFloat();
		desc = (pd*pp)/100;
		vd = pp-desc;
		System.out.println("\n O valor com desconto ser�: R$" + vd);
	}
}

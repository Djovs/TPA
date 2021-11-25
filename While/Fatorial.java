import java.util.Scanner;
public class Fatorial {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int n, i=1, fa=1;
		System.out.println("Insira o valor: ");
		n = in.nextInt();
		while (i<=n) {
			fa = fa*i;
			i++;
		}
		System.out.println(fa);
		in.close();
	}

}

import java.util.Scanner;
public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, i, a[], rest0 = 0, j;
		final int TAM = 5;
		a = new int[TAM];
		
		for(j=0;j<TAM;j++) {
			rest0=0;
			System.out.println("Entre com um n�mero:");
			a[j] = in.nextInt();
			
			for (i=1;i<=a[j];i++) {
				if (a[j]%i==0) {
					rest0++;
				}
			}
			if (rest0 > 2) {
				System.out.println("N�o � n�mero primo");
			}else {
				System.out.println("� n�mero primo");
			}
		}
		in.close();
	}
}
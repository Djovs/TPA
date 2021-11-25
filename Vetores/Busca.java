import java.util.Scanner;
public class Busca {
	public static void main(String[] args) {
		
		boolean vdd = false;
		Scanner in = new Scanner(System.in);
		
		int i, a[], dif; 
		final int TAM = 10;
		a = new int [TAM];
		
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor A: ");
			a[i] = in.nextInt();
		}
		
		System.out.println("Digite o elemento para buscar... ");
		dif = in.nextInt();
		
		for(i=0;i<TAM; i++) {
			if (a[i] == dif) {
				vdd = true;
			}
		}
		
		if(vdd) {
			System.out.println("Está no vetor"); 
		}else {
			System.out.println("Não está no vetor"); 
		}
	}

}

		
		
		/*voltar nessa tbm
		int i, a[], x, busca = 0;
		final int TAM = 3;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor A: ");
			a[i] = in.nextInt();	
		}
		
		System.out.println("Escreva o valor que quer buscar: ");
		x = in.nextInt();
		
		for(i=0;i<TAM;i++) {
			if (x == a[i]) {
				busca=1;
			}else {
				busca = 0;
			}
		}
		if (x == busca) {
			System.out.println("Está no vetor");	
		}else {
			System.out.println("Não está no vetor");	
		}
		
	}
}*/
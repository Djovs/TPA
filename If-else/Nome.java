import java.util.Scanner;
public class Nome {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		String nma, nme, n;
		int idma, idme, id;
		System.out.println("Insira o primeiro nome: ");
		n = in.next();
		System.out.println("Insira a primeira idade: ");
		id = in.nextInt();
		nma = n;
		idma = id;
		nme = n;
		idme = id; 
		System.out.println("Insira o segundo nome: ");
		n = in.next();
		System.out.println("Insira a segunda idade: ");
		id = in.nextInt();
		if (id>idma) {
			nma = n;
		    idma = id;
		}else if (id<idma) {
			nma = n;
			idma = id;
			System.out.println("Insira o terceiro nome: ");
			n = in.next();
			System.out.println("Insiea a terceira idade: ");
			id = in.nextInt();
		if (id>idme) {
			nme = n;
			idme = id;
		}else if (id<idma) {
			nma = n;
			idme = id;
			System.out.println("Insira o quarto nome: ");
			n = in.next();
			System.out.println("Insira a quarta idade: ");
			id = in.nextInt();
		if (id>idma) {
			nma = n;
			idma = id;
		}else if (id<idma) {
			nma = n;
			idma = id;
			System.out.println("Insira o quinto nome: ");
			n = in.next();
			System.out.println("Insira a quinta idade: ");
			id = in.nextInt();
		if (id<idma) {
			nme = n;
			idme = id;
		}else if (id>idma) {
			nma = n;
			idma = id;
			System.out.println("A idade do(a) mais velho �: "+idma+"");
			System.out.println("O nome do(a) usu�rio(a) mais velho(a) �: "+nma+"");
			System.out.println("A idade do(a) mais novo �: "+idme+"");
			System.out.println("O nome do(a) usu�rio(a) mais novo �: "+nme+"");
		}
			}
		}
		}
		
	}

}

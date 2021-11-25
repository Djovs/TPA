import java.util.Scanner;
public class AlunosIdade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, idade, ma=0, me=0;
		while (i<=10) {
			System.out.println("Insira a idade do aluno "+i+":");
			idade = in.nextInt();
			if (idade<18) {
				me++;
			}else {
				ma++;
					
			}
			i++;
		}
		System.out.println("A quantidade de alunos de menor é "+me);
		System.out.println("A quantidade de alunos de maior é "+ma);
		in.close();
		
	}

}

import java.util.Scanner;
public class Altura {
	public static void main(String args[]) {
		int i=0;
		double aj,ap;
		aj = 1.34;
		ap = 1.45;
		while (aj<=ap) {
			aj = aj+0.025;
			ap = ap+0.2;
			i++;
		}
		System.out.println("Foram necessários "+i+" anos para João ser o mais alto. ");
	}
	
}

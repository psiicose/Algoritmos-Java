import java.util.Scanner;

public class EX4 {
	public static void main(String args[])
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe P1, P2, P3 e NT nesta sequencia");
		double n1 = leitor.nextDouble();
		double n2 = leitor.nextDouble();
		double n3 = leitor.nextDouble();
		double nt = leitor.nextDouble();
		nt = (n1*0.2 + n2*0.3 + n3*0.5)*0.85 + nt*0.15;
		System.out.println("A nota final é " + nt);
		leitor.close();
	}
}

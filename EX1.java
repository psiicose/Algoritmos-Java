import java.util.Scanner;

public class EX1 {
	public static void main(String args[])
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade gasta em quilowatts");
		float quantidade = leitor.nextFloat();
		System.out.println("Informe o valor do quilowatt em real(R$)");
		float valor = leitor.nextFloat();
		quantidade = quantidade * valor * 0.9f;
		System.out.println("A quantidade a ser paga é R$ " + quantidade);
	}
}
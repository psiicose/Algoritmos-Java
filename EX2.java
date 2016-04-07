import java.util.Scanner;

public class EX2 {
	public static void main(String args[])
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe dois numeros");
		double num1 = leitor.nextDouble();
		double num2 = leitor.nextDouble();
		if(num1 == num2)
			System.out.println("Numeros iguais");
		else if(num1 > num2)
			System.out.println("O primeiro numero é maior");
		else
			System.out.println("O segundo numero é maior");
		
		leitor.close();
	}
}

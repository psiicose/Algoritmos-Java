import java.util.Scanner;

public class EX3 {
	public static void main (String args[])
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o dia da semana(1-7)");
		int dia = leitor.nextInt();
		switch (dia)
		{
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("Dia invalido!!");
		}
		leitor.close();
	}
}

import java.util.Scanner;
public class EX5 {
	public static void main(String args[])
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o ano");
		int ano = leitor.nextInt();
		if((ano%4 == 0 && ano%100 != 0) || ano%400 == 0)
			System.out.println("Este ano é bisexto");
		else 
			System.out.println("Este ano não é bisexto");
		leitor.close();
	}
}

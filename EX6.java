import java.util.Scanner;

public class EX6 {
	public static void main(String args[])
	{
		int soma = 0;
		Scanner leitor = new Scanner(System.in);
		for(int i = 0; i<101; i++)
		{
			if(i%2 != 0)
				soma += i;
		}
		System.out.println("O resultado da soma é " + soma);
		leitor.close();
	}
}

package AulaArthur;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// comando para organizar
		// cntrl + shift + f
		

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("---------");
			System.out.println("Escolha uma opção");
			System.out.println("1 - Novo calculo");
			System.out.println("9 - Sair do sistemas");
			System.out.println("---------");
			int opcao = teclado.nextInt();
			// a será o primeiro valor
			// b será o segundo valor

			double a, b = 0;

			switch (opcao) {
			case 1: {

				System.out.println("---------");
				System.out.println("Digite o primeiro número: ");
				a = teclado.nextDouble();
				System.out.println(a);
				System.out.println("Digite o segundo número: ");
				b = teclado.nextDouble();
				System.out.println("Digite a operação");
				System.out.println("1-Soma");
				System.out.println("2-multiplicação");
				System.out.println("3-Divisão");
				System.out.println("4-Subtração");
				opcao = teclado.nextInt();
				if (opcao == 1) {
					System.out.println("Resultado: " + (a + b));
				}
				if (opcao == 2) {
					System.out.println("Resultado: " + (a * b));
				}
				if (opcao == 3) {
					System.out.println("Resultado: " + (a / b));
				}
				if (opcao == 4) {
					System.out.println("Resultado: " + (a - b));
				}
				
				
				continue;
			}

			case 9: {
				System.out.println("Saindo do sistemas");
				System.exit(0);
			}
			default:
				System.out.println("Opção inválida");

			}
		} while (true);

	}

}

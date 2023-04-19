package triangulo_do_while;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double base , altura , area ;
		
		do {
			System.out.println("Digite a medida da base do triângulo: ");
			base = input.nextDouble();
			
			System.out.println("Digite a medida da altura do triângulo: ");
			altura = input.nextDouble();
			
			if (base <= 0 || altura <=0) {
				System.out.println("As medidas fornecidas são inválidas. Tente novamente ");
			}
		} while (base <= 0 || altura <= 0);
		
		area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é: %.2f", area);
		
		input.close();
	}

}

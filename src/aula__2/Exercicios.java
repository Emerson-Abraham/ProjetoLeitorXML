package aula__2;

/*
a.exibir os n�meros pares de 100 a 0.
b.exibir a soma dos n�meros de 0 a 100.
c.verificar o peso de tr�s metais e informar o mais pesado.
d.exibir os n�meros de 0 a 100, exceto o intervalo de 50 a 75.
*/

public class Exercicios {
	public static void main(String[] args) {

		// a
		for (int i = 100; i >= 0; i -= 2) {
			System.out.println(i);

		}

		// b
		int j = 0;
		int soma = 0;
		while (j <= 100) {
			soma = soma + j;
			j++;
		}
		System.out.println("Soma:" + soma);

		// c
		float ouro = 1;
		float prata = 3;
		float bronze = 2;

		if (ouro > prata) {
			if (ouro > bronze) {
				System.out.println("Ouro � o metal mais pesado");
			} else {
				System.out.println("Bronze � o metal mais pesado");
			}
		} else {
			if (prata > bronze) {
				System.out.println("Prata � o metal mais pesado");
			} else {
				System.out.println("Bronze � o metal mais pesado");
			}
		}

		// d
		for (int k = 0; k <= 100; k++) {
			if (k > 50 && k < 75) {
				continue;
			}
			System.out.println(k);
		}


	}
}

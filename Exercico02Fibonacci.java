
public class Exercico02Fibonacci {

	public static void main(String[] args) {

		int vezes = 13;

		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + " ");

			i = i + j;
			j = i - j;

		}
		if (vezes <= 13) {

			System.out.println("\nO número " + vezes + " percentece a sequência de Fibonacci.");
		} else {
			System.out.println("Este número não faz parte da sequência proposta!");
		}
	}
}

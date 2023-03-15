
public class Exercicio05 {

	public static void main(String[] args) {

		String nome = "Kenneth";
		String inverta = "";
		for (int b = nome.length() - 1; b >= 0; b--) {
			inverta += String.valueOf(nome.charAt(b));

		}
		System.out.println(inverta);
	}

}

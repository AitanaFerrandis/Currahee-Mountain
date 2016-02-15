package curraee;

public class MyLittlePony {
	public static void main(String[] args) {
		//String a codificar
		String frase="Paco es un cachondo";
		//Convertimos vocales en mayusculas
		frase=frase.replaceAll("a", "A");
		frase=frase.replaceAll("e", "E");
		frase=frase.replaceAll("i", "I");
		frase=frase.replaceAll("o", "O");
		frase=frase.replaceAll("u", "U");
		//Por pantalla
		System.out.println(frase);
		frase=frase.replaceAll("A","a");
		frase=frase.replaceAll("E", "e");
		frase=frase.replaceAll("I", "i");
		frase=frase.replaceAll("O", "o");
		frase=frase.replaceAll("U", "u");
		System.out.println(frase);

		}
}

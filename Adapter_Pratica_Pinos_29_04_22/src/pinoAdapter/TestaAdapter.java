package pinoAdapter;

public class TestaAdapter {

	public static void main(String[] args) {
		BuracoRedondo buraco = new BuracoRedondo(70) {
		};
		PinoQuadrado pinoQuadrado = new PinoQuadrado(10);
		System.out.println("A largura do pino quadrado é: " + pinoQuadrado.getLargura());
		System.out.println("O seu quadrado equivale a: " + pinoQuadrado.getQuadrado());

		PinoQuadradoAdapter pinoRedondo = new PinoQuadradoAdapter(pinoQuadrado);
		System.out.println("\nO raio do pino redondo é: " + pinoRedondo.getRaio());

		System.out.println("\nO pino redondo encaixa no buraco? " + buraco.Encaixa(pinoRedondo));
	}

}

package pinoAdapter;

public class PinoQuadrado {
	private final double largura;

	public PinoQuadrado(double largura) {
		this.largura = largura;
	}

	public double getLargura() {
		return this.largura;
	}

	public double getQuadrado() {
		return Math.pow(largura, 2);
	}
}

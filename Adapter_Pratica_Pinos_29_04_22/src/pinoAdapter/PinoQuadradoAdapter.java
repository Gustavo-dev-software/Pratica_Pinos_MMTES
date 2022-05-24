package pinoAdapter;

public class PinoQuadradoAdapter extends PinoRedondo{
	private final PinoQuadrado pino;

	public PinoQuadradoAdapter(PinoQuadrado pino) {
		this.pino = pino;
	}

	@Override
	public double getRaio() {
		return Math.pow((pino.getLargura() / 2), 2);
	}
}

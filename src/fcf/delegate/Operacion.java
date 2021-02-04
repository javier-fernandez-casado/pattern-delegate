package fcf.delegate;

public class Operacion extends Medico {

	Ayudante ayudante;

	public Operacion() {

		ayudante = new Ayudante();

	}

	public void operar() {

		System.out.println("SE REALIZA LA OPERACIÓN CON LOS MEDIOS:");
		ayudante.asistente();
		ayudante.preparaInstrumental();
		opera();
	}
}

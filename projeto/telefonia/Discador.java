package projeto.telefonia;

public class Discador implements DiscadorTelefonico {
	public void ligar() {
		System.out.println("Realizando ligação");
	}
	public void atender() {
		System.out.println("Atendendo ligação");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz inicializado");
	}
}

package projeto.reprodutormusical;

public class Spotify implements ReprodutorMusical {
	public void tocar() {
		System.out.println("Tocar Musica!");
	}
	public void pausar(){
		System.out.println("Musica Pausada!");
	}
	public void selecionarMusica() {
		System.out.println("Musica selecionada é ...");
	}
}

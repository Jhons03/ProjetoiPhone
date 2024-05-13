package projeto;

import projeto.navegadorinternet.*;
import projeto.reprodutormusical.*;
import projeto.telefonia.*;

public class Apple {

	public static void main(String[] args) {
		
		NavegadorInternet safari = new Safari();
		ReprodutorMusical mediaplayer = new Spotify();
		DiscadorTelefonico telefonia = new Discador();
		
		
		safari.exibirPagina();
		safari.atualizarPagina();
		mediaplayer.selecionarMusica();
		mediaplayer.tocar();
		telefonia.atender();
	}

}

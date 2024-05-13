package projeto.modelo;

import projeto.navegadorinternet.*;
import projeto.reprodutormusical.*;
import projeto.telefonia.*;

public class iPhone implements NavegadorInternet, ReprodutorMusical, DiscadorTelefonico {

	@Override
	public void ligar() {
		System.out.println("Realizando ligação no aparelho iPhone");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação no aparelho iPhone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Entrando no correio de voz no aparelho iPhone");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica no aparelho iPhone");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música no aparelho iPhone");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada no aparelho iPhone é ...");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página no navegador do aparelho iPhone");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada no navegador do aparelho iPhone");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada no navegador do aparelho iPhone");
	}		
		
	}

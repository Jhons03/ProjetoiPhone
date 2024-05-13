package projeto.navegadorinternet;
public class Safari implements NavegadorInternet{
	public void exibirPagina() {
		System.out.println("Exibindo pagina atual.");
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba ao navegador.");
	}
	public void atualizarPagina() {
		System.out.println("Pagina atualizada com sucesso.");
	}
}

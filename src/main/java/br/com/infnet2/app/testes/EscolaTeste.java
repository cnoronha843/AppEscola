package br.com.infnet2.app.testes;

import br.com.infnet2.app.controller.EscolaController;
import br.com.infnet2.app.negocio.Escola;

public class EscolaTeste {

	public static void main(String[] args) {
		
		EscolaController controller = new EscolaController();
		
		controller.incluir(new Escola("Roma"));
		controller.incluir("Souza Aguiar");
		controller.incluir(new Escola("Infnet"));
		System.out.println("Escolas: " + controller.obterLista());
		controller.excluir(2);
		System.out.println("Escolas: " + controller.obterPorId(1));

	}

}

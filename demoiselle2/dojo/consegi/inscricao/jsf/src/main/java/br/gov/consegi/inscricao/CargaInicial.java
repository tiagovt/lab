package br.gov.consegi.inscricao;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.annotation.Startup;

public class CargaInicial {

	@Inject
	private Inscricao inscricao;

	@Startup
	public void carregar() {
		inscricao.cadastrar("Wilson");
		inscricao.cadastrar("ZyC");
	}
}

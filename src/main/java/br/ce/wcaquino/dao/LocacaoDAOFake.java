package br.ce.wcaquino.dao;

import java.util.List;

import br.ce.wcaquino.entidades.Locacao;

public class LocacaoDAOFake implements LocacaoDAO {

	public void salvar(Locacao locacao) {

	}

	public List<Locacao> obterLocacoesPendentes() {
		return null;
	}

	public List<Locacao> findEmAtraso() {
		return null;
	}
}

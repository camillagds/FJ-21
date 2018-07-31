package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(2004, 10, 06);

		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro, 3185 - cj57");
		contato.setDataNascimento(dataNascimento);

		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");
	}

}

package com.angoti;

import java.util.List;

public class Teste {
	public static void main(String[] args) {
		ContaDAO dao = new ContaDAO();
		List<Conta> lista = dao.todos();
		for (Conta conta : lista) {
			System.out.println("Nome do correntista: " + conta.getTitular());
		}
	}
}

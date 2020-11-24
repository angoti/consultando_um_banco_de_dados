package com.angoti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {

	public void inserir(Conta c) {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "insert into conta(titular,numero,agencia,limite,saldo) values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, c.getTitular());
			stmt.setInt(2, c.getNumero());
			stmt.setInt(3, c.getAgencia());
			stmt.setDouble(4, c.getLimite());
			stmt.setDouble(5, c.getSaldo());
			
			stmt.execute();
			
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Conta> todos() {
		List<Conta> lista = new ArrayList<Conta>();
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "select * from conta;";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			ResultSet retorno = stmt.executeQuery();
			while(retorno.next()) {
				int id = retorno.getInt("id");
				String tit = retorno.getString("titular");
				int nro = retorno.getInt("numero");
				int ag = retorno.getInt("agencia");
				double lim = retorno.getDouble("limite");
				double saldo = retorno.getDouble("saldo");
				Conta conta = new Conta(id,tit,nro,ag,lim,saldo);
				lista.add(conta);
			}
			retorno.close();
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return lista;
	}
}

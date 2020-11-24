package com.angoti;

public class Conta {
	private String titular;
	private int id, numero, agencia;
	private double limite, saldo;

	public Conta(int id, String titular, int numero, int agencia, double limite, double saldo) {
		super();
		this.titular = titular;
		this.id = id;
		this.numero = numero;
		this.agencia = agencia;
		this.limite = limite;
		this.saldo = saldo;
	}

	public Conta() {
		super();
	}

	public Conta(String titular, int numero, int agencia, double limite, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.limite = limite;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

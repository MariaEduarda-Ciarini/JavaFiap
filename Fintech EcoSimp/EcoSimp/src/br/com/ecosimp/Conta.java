package br.com.ecosimp;
import java.util.Date;

public class Conta {
	private int id;
	private double saldo;
	private Cliente Cliente;
	private float pagamentoFatura;
	private Date vencimentoFatura;
	
	public Conta( int id,double saldo,Cliente Cliente,float pagamentoFatura,Date vencimentoFatura) {
	this.id = id;
	this.saldo =saldo;
	this.Cliente = Cliente;
	this.pagamentoFatura = pagamentoFatura;
	this.vencimentoFatura = vencimentoFatura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public float getPagamentoFatura() {
		return pagamentoFatura;
	}

	public void setPagamentoFatura(float pagamentoFatura) {
		this.pagamentoFatura = pagamentoFatura;
	}

	public Date getVencimentoFatura() {
		return vencimentoFatura;
	}

	public void setVencimentoFatura(Date vencimentoFatura) {
		this.vencimentoFatura = vencimentoFatura;
	}
	
}

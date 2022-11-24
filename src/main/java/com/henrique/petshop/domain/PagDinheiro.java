package com.henrique.petshop.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.henrique.petshop.domain.enuns.SituacaoPagamento;

@Entity
public class PagDinheiro extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	private Double desconto;
	
	public PagDinheiro() {
		
	}

	public PagDinheiro(Integer id, Double valor, SituacaoPagamento situacao, Servico servico, Date dataVencimento, Double desconto) {
		super(id, valor, situacao, servico);
		this.dataVencimento = dataVencimento;
		this.desconto = desconto;
		// TODO Auto-generated constructor stub
	}

	public Date getDataPagamento() {
		return dataVencimento;
	}

	public void setDataPagamento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
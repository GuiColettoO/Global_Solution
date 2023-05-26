package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_ALM_NOTA_FISCAL")
@SequenceGenerator(sequenceName="SQ_T_ALM_NOTA_FISCAL", name="vendedora", allocationSize=1)
public class NotaFiscal {

	@Id
	@Column(name="ID_NOTA_FISCAL", precision=5)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendedora")
	private int id;
	
	@Column(name="DT_VENDA", nullable=false)
	private Calendar dataVenda;
	
	@Column(name="QT_POR_PRODUTO", precision=4, nullable=false)
	private int qtPorProduto;
	
	@Column(name="VL_PRECO_TIPO", precision=5, scale=2, nullable=false)
	private int valorPorProduto;
	
	@Column(name="VL_PRECO_TOTAL", precision=7, scale=2, nullable=false)
	private int valorTotal;
	
	public NotaFiscal() {}
	
	public NotaFiscal(Calendar dataVenda, int qtPorProduto, int valorPorProduto, int valorTotal) {
		this.dataVenda = dataVenda;
		this.qtPorProduto = qtPorProduto;
		this.valorPorProduto = valorPorProduto;
		this.valorTotal = valorTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Calendar dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getQtPorProduto() {
		return qtPorProduto;
	}

	public void setQtPorProduto(int qtPorProduto) {
		this.qtPorProduto = qtPorProduto;
	}

	public int getValorPorProduto() {
		return valorPorProduto;
	}

	public void setValorPorProduto(int valorPorProduto) {
		this.valorPorProduto = valorPorProduto;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
}
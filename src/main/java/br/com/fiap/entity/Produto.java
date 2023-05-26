package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_ALM_PRODUTO")
@SequenceGenerator(sequenceName="SQ_T_ALM_PRODUTO", name="produto", allocationSize=1)
public class Produto {

	@Id
	@Column(name="ID_PRODUTO", precision=5)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto")
	private int id;
	
	@Column(name="NM_PRODUTO", length=50, nullable=false)
	private String nome;
	
	@Column(name="NM_MARCA", length=50, nullable=false)
	private String marca;
	
	@Column(name="DS_TIPO", length=40, nullable=false)
	@Enumerated(EnumType.STRING)
	private TipoProduto tipo;
	
	@Column(name="DS_LOTE", length=15, nullable=false)
	private String lote;
	
	@Column(name="DT_VALIDADE", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataValidade;
	
	@Column(name="NR_PRECO", precision=8, scale=2, nullable=false)
	private Float precoUnidade;
	
	public Produto() {}
	
	public Produto(String nome, String marca, TipoProduto tipo, String lote, Calendar dataValidade, Float precoUnidade) {
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
		this.lote = lote;
		this.dataValidade = dataValidade;
		this.precoUnidade = precoUnidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProduto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Float getPrecoUnidade() {
		return precoUnidade;
	}

	public void setPrecoUnidade(Float precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	
}

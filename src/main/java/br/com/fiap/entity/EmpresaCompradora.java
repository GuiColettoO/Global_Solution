package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_ALM_EMPRESA_VENDEDORA")
@SequenceGenerator(sequenceName="SQ_T_ALM_EMPRESA_VENDEDORA", name="vendedora", allocationSize=1)
public class EmpresaCompradora {

	@Id
	@Column(name="ID_VENDEDORA", precision=5)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendedora")
	private int id;
	
	@Column(name="NR_CNPJ", precision=14, nullable=false)
	private String cnpj;
	
	@Column(name="DS_RAZAO_SOCIAL", length=40, nullable=false)
	private String razaoSocial;
	
	@Column(name="NM_EMPRESA", length=40, nullable=false)
	private String nomeEmpresa;
	
	@Column(name="TP_CONTATO", length=40, nullable=false)
	@Enumerated(EnumType.STRING)
	private TipoContato tipoContato;
	
	@Column(name="DS_CONTATO", length=40, nullable=false)
	private String contato;
	
	@Column(name="DS_STATUS", length=10, nullable=false)
	private boolean status;
	
	public EmpresaCompradora() {}

	public EmpresaCompradora(String cnpj, String razaoSocial, String nomeEmpresa, TipoContato tipoContato,
			String contato, boolean status) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeEmpresa = nomeEmpresa;
		this.tipoContato = tipoContato;
		this.contato = contato;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public TipoContato getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
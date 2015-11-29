package models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Anuncio {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String titulo;
	
	@Column
	private String descricao;
	
	@Column
	private String cidade;
	
	@Column
	private String bairro;
	
	@Column
	private String instrumentos;
	
	@Column
	private String estilosFavoritos;
	
	@Column
	private String estilosIndesejados;
	
	@Column
	private boolean casual;
	
	@Column
	private String contato;
	
	public Anuncio() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getInstrumentos() {
		return instrumentos;
	}
	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}
	public String getEstilosFavoritos() {
		return estilosFavoritos;
	}
	public void setEstilosFavoritos(String estilosFavoritos) {
		this.estilosFavoritos = estilosFavoritos;
	}
	public String getEstilosIndesejados() {
		return estilosIndesejados;
	}
	public void setEstilosIndesejados(String estilosIndesejados) {
		this.estilosIndesejados = estilosIndesejados;
	}
	public boolean isCasual() {
		return casual;
	}
	public void setCasual(boolean casual) {
		this.casual = casual;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contatos) {
		this.contato = contatos;
	}
	
	@Override
	public String toString() {
		ArrayList<String> att = new ArrayList<String>();
		
		att.add(this.nome);
		att.add(this.titulo);
		att.add(this.descricao);
		att.add(this.cidade);
		att.add(this.bairro);
		att.add(this.instrumentos);
		att.add(this.estilosFavoritos);
		att.add(this.estilosIndesejados);
		att.add(this.contato);
		att.add(this.casual ? "TRUE" : "FALSE");
		
		return att.toString();
	}
}

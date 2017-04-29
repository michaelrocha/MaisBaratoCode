package br.edu.ifba.eunapolis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
    @NotEmpty
	private String nome;
	
	@NotNull
    @NotEmpty
	private String email;
	
	private List<ListaCompra> listaCompras;
	private List<Produto> favoritos;
	private List<Produto> similares;
	
	private int pontuacao;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public List<ListaCompra> getListaCompras() {
		return listaCompras;
	}
	public List<Produto> getFavoritos() {
		return favoritos;
	}
	public List<Produto> getSimilares() {
		return similares;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setListaCompras(List<ListaCompra> listaCompras) {
		this.listaCompras = listaCompras;
	}
	public void setFavoritos(List<Produto> favoritos) {
		this.favoritos = favoritos;
	}
	public void setSimilares(List<Produto> similares) {
		this.similares = similares;
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	

}

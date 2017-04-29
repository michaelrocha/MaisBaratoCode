package br.edu.ifba.eunapolis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class CategoriaProduto {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@NotEmpty
	private String nome;
	private CategoriaProduto subcategoria;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public CategoriaProduto getSubcategoria() {
		return subcategoria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSubcategoria(CategoriaProduto subcategoria) {
		this.subcategoria = subcategoria;
	}

}
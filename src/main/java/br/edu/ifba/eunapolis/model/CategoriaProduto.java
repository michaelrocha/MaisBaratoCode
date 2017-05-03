package br.edu.ifba.eunapolis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Vitor
 * @version 1.0.0
 * @since 29/04/2017
 *
 */

@Entity
public class CategoriaProduto {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@NotEmpty
	private String nome;
	
	@OneToMany
	private List<CategoriaProduto> subcategoria;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public List<CategoriaProduto> getSubcategoria() {
		return subcategoria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSubcategoria(List<CategoriaProduto> subcategoria) {
		this.subcategoria = subcategoria;
	}

}

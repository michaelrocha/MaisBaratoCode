package br.edu.ifba.eunapolis.model;

import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@XmlRootElement
public class Unidade {
	
	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
    @NotEmpty
	private String tipo;
	
	private int descricao;
	
	public String getTipo() {
		return tipo;
	}
	
	public int getdescricao() {
		return descricao;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setdescricao(int descricao) {
		this.descricao = descricao;
	}


}

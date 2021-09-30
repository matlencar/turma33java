package com.minhaLojaDeGames.ecommerceGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_games")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@NotNull
	@Size(min = 2 , max = 50)
	private String nome;
	
	private double preco;

	@OneToMany(mappedBy = "games", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("games")
	private List<CategoriaGames> tb_games;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<CategoriaGames> getTb_games() {
		return tb_games;
	}

	public void setTb_games(List<CategoriaGames> tb_games) {
		this.tb_games = tb_games;
	}
	
	
	
	
	
}

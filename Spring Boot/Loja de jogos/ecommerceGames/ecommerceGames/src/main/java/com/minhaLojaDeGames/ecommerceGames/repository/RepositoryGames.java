package com.minhaLojaDeGames.ecommerceGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.minhaLojaDeGames.ecommerceGames.model.CategoriaGames;

@Repository
public interface RepositoryGames extends JpaRepository<CategoriaGames, Long> {
	
	public List<CategoriaGames> findAllByDescricaoContainingIgnoreCase (String descricao);

}

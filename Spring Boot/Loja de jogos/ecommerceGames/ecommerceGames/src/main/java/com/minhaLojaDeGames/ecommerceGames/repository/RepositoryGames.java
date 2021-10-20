package com.minhaLojaDeGames.ecommerceGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.minhaLojaDeGames.ecommerceGames.model.Categoria;

@Repository
public interface RepositoryGames extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);

}

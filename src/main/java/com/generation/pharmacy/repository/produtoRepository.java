package com.generation.pharmacy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.pharmacy.model.produtoModel;

@Repository
public interface produtoRepository extends JpaRepository<produtoModel,Long>{

	public List <produtoModel> findAllBynomeProdutoContainingIgnoreCase(String nomeProduto);
}


